package com.github.spocot.mythra.mapEditor;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import com.github.spocot.mythra.*;

public class EditorPanel extends AnimationPanel{

	private volatile boolean buildingSelected = false;

	private Map map;

	private Block[][] mapOutline;

	//Constructor for a blank map
	public EditorPanel() {
		super(500, 500);
		map = new Map();
	}

	@Override
	public void mouseDraggedEvents(MouseEvent e) {
		if(!buildingSelected)
			mouseClickedEvents(e);
	}

	@Override
	public void mouseMovedEvents(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressedEvents(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode){
		case KeyEvent.VK_S:{
			MapLoader loader = new MapLoader(JOptionPane.showInputDialog("Enter the name to save under:"));
			loader.writeMap(map);
		}break;
		case KeyEvent.VK_L:{
			MapLoader loader = new MapLoader(JOptionPane.showInputDialog("Enter the name of the file to load:"));
			map = loader.loadMap();
		}break;
		}
	}

	@Override
	public void keyReleasedEvents(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateGame() {

	}

	@Override
	public void drawGame(Graphics g) {
		map.render(g);
	}

	@Override
	public void mouseClickedEvents(MouseEvent e) {
		
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

	}

	@Override
	public void mouseReleasedEvents(MouseEvent e) {

	}
}
