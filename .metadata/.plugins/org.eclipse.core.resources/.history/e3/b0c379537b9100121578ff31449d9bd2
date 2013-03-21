package com.github.spocot.mythra;

import java.awt.Color;
import java.awt.Graphics;

public class Block {
	
	//Height and width
	private static final int width = 10;
	private static final int height = 10;
	
	//Variable for collision
	private boolean canCollide;
	
	//Color variable
	private Color color;
	
	//Location of the block
	private int x;
	private int y;
	
	public Block(boolean canCollide, Color color, int x, int y){
		this.canCollide = canCollide;
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public void render(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}
