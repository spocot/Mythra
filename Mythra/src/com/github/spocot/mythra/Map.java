package com.github.spocot.mythra;

import java.awt.Graphics;
import java.util.ArrayList;

public class Map {

	//ArrayList containing all of the blocks on the map
	private Block[][] blocks;

	public Map(Block[][] blocks){
		this.blocks = blocks;
	}

	public Map(){
		blocks = new Block[50][50];
		for(int i = 0; i < 50; i++){
			for(int j = 0; j < 50; j++){
				blocks[i][j] = new BlockGrass(i * 10, j * 10);
			}
		}
	}

	public void render(Graphics g){
		for(int i = 0; i < blocks.length; i++){
			for(int j = 0; j < blocks[i].length; j++){
				blocks[i][j].render(g);
			}
		}
	}

	public boolean checkCollide(Player player){
		boolean collided = false;
		for(int i = 0; i < blocks.length; i++){
			for(int j = 0; j < blocks[i].length; j++){
				collided = blocks[i][j].checkCollide(player) ? true : collided;
			}
		}
		return collided;
	}

	public void update(Block[][] blocks){
		this.blocks = blocks;
	}
}
