package com.github.spocot.mythra.mapEditor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.github.spocot.mythra.Map;

public class MapLoader {

	private File filename;

	public MapLoader(String filename){
		this.filename = new File(filename);
		if(!this.filename.exists()){
			try {
				System.out.println("Creating file");
				this.filename.createNewFile();
				System.out.println("File created");
				System.out.println(this.filename.getAbsolutePath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Map loadMap(){
		Map map = null;
		try{
			InputStream file = new FileInputStream(filename.getAbsolutePath());
			InputStream buffer = new BufferedInputStream( file );
			ObjectInput input = new ObjectInputStream ( buffer );
			try{
				map = (Map)input.readObject();
				System.out.println("Map loaded");
			}finally{
				input.close();
			}
		}catch(ClassNotFoundException ex){
			System.out.println("Cannot perform input. Class not found." + ex);
		}catch(IOException ex){
			System.out.println("Cannot perform input." + ex);
		}
		return map;
	}

	public void writeMap(Map map){
		try{
			OutputStream file = new FileOutputStream(filename.getAbsolutePath());
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try{
				output.writeObject(map);
				System.out.println("Data written");
			}finally{
				output.close();
			}
		}catch(IOException ex){
			System.out.println("Cannot perform output." + ex);
		}
	}
}
