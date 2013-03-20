package com.github.spocot.mythra;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	//Height and width variables
	private static final int width = 16;
	private static final int height = 16;
	
	//Location variable
	private int x;
	private int y;
	
	//Direction player is moving
	private Direction direction = Direction.NEUTRAL;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/** Set direction that the player is moving */
	public void setDirection(Direction direction){this.direction = direction;}
	
	/** Return the direction that the player is moving */
	public Direction getDirection(){return direction;}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	
	public void update(){
		x += direction.xVar();
		y += direction.yVar();
	}
	
	public void render(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}
}
