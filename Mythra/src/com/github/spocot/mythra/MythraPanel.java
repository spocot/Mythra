package com.github.spocot.mythra;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MythraPanel extends AnimationPanel{

	private ArrayList<Block> blocks = new ArrayList<Block>();
	private Map map;
	private Player player = new Player(100,100);
	
	public MythraPanel(int pWidth, int pHeight) {
		super(pWidth, pHeight);
		
		for(int x = 0; x < 500; x += 10){
			for(int y = 0; y < 500; y += 10){
				blocks.add(new BlockGrass(x,y));
			}
		}
		blocks.set(0, new BlockWall(0,0));
		map = new Map(blocks);
	}

	@Override
	public void mouseDraggedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMovedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClickedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEnteredEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExitedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleasedEvents(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressedEvents(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleasedEvents(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGame() {
		// TODO Auto-generated method stub
		player.update();
	}

	@Override
	public void drawGame(Graphics g) {
		// TODO Auto-generated method stub
		map.render(g);
		player.render(g);
	}
	
}
