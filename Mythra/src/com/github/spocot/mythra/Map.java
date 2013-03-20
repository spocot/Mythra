package com.github.spocot.mythra;

import java.awt.Graphics;
import java.util.ArrayList;

public class Map {
	
	//ArrayList containing all of the blocks on the map
	private ArrayList<Block> blocks;
	
	public Map(ArrayList<Block> blocks){
		this.blocks = blocks;
	}
	
	public void render(Graphics g){
		int currentBlock = 0;
		
		//Placeholder rending code
		//Renders in a line by line fashion
		for(int i = 0; i < 500; i =+ 10){
			for(int j = 0; j < 500; j =+ 10){
				blocks.get(currentBlock++).render(g, j, i);
			}
		}
	}
}
