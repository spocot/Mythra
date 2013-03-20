package com.github.spocot.mythra;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	//Location variable
	private int x;
	private int y;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void render(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(x, y, 5, 5);
	}
}