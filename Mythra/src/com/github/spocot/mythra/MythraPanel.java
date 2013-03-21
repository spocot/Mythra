package com.github.spocot.mythra;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MythraPanel extends AnimationPanel{

	private Block[][] blocks;
	private Map map;
	private Player player = new Player(100,100);

	//Movement variablees
	private volatile boolean wPressed = false;
	private volatile boolean aPressed = false;
	private volatile boolean sPressed = false;
	private volatile boolean dPressed = false;


	public MythraPanel(int pWidth, int pHeight) {
		super(pWidth, pHeight);
		map = new Map();
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
		int keyCode = e.getKeyCode();
		switch(keyCode){
		case KeyEvent.VK_W:{
			wPressed = true;
			if(aPressed)
				player.setDirection(Direction.NORTH_WEST);
			else if(dPressed)
				player.setDirection(Direction.NORTH_EAST);
			else if(sPressed)
				player.setDirection(Direction.NEUTRAL);
			else
				player.setDirection(Direction.NORTH);
		}break;
		case KeyEvent.VK_A:{
			aPressed = true;
			if(wPressed)
				player.setDirection(Direction.NORTH_WEST);
			else if(sPressed)
				player.setDirection(Direction.SOUTH_WEST);
			else if(dPressed)
				player.setDirection(Direction.NEUTRAL);
			else
				player.setDirection(Direction.WEST);
		}break;
		case KeyEvent.VK_S:{
			sPressed = true;
			if(aPressed)
				player.setDirection(Direction.SOUTH_WEST);
			else if(dPressed)
				player.setDirection(Direction.SOUTH_EAST);
			else if(wPressed)
				player.setDirection(Direction.NEUTRAL);
			else
				player.setDirection(Direction.SOUTH);
		}break;
		case KeyEvent.VK_D:{
			dPressed = true;
			if(wPressed)
				player.setDirection(Direction.NORTH_EAST);
			else if(sPressed)
				player.setDirection(Direction.SOUTH_EAST);
			else if(aPressed)
				player.setDirection(Direction.NEUTRAL);
			else
				player.setDirection(Direction.EAST);
		}break;
		}

	}

	@Override
	public void keyReleasedEvents(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode){
		case KeyEvent.VK_W:{
			wPressed = false;
			Direction direction = player.getDirection();
			switch(direction){
			case NORTH_WEST:player.setDirection(Direction.WEST);break;
			case NORTH_EAST:player.setDirection(Direction.EAST);break;
			}
		}break;
		case KeyEvent.VK_A:{
			aPressed = false;
			Direction direction = player.getDirection();
			switch(direction){
			case NORTH_WEST:player.setDirection(Direction.NORTH);break;
			case SOUTH_WEST:player.setDirection(Direction.SOUTH);break;
			}
		}break;
		case KeyEvent.VK_S:{
			sPressed = false;
			Direction direction = player.getDirection();
			switch(direction){
			case SOUTH_WEST:player.setDirection(Direction.WEST);break;
			case SOUTH_EAST:player.setDirection(Direction.EAST);break;
			}
		}break;
		case KeyEvent.VK_D:{
			dPressed = false;
			Direction direction = player.getDirection();
			switch(direction){
			case SOUTH_EAST:player.setDirection(Direction.SOUTH);break;
			case NORTH_EAST:player.setDirection(Direction.NORTH);break;
			}
		}break;
		}
		if(!wPressed && !aPressed && !sPressed && !dPressed)
			player.setDirection(Direction.NEUTRAL);

	}

	@Override
	public void updateGame() {
		blocks = map.getBlocks();
		int prevX = player.getX();
		int prevY = player.getY();
		player.update();
		if(map.checkCollide(player))
			player.setPosition(prevX, prevY);
	}

	@Override
	public void drawGame(Graphics g) {
		map.render(g);
		player.render(g);
	}

}
