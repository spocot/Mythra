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
		for(int i = 0; i < blocks.size(); i++){
			blocks.get(i).render(g);
		}
	}
}
