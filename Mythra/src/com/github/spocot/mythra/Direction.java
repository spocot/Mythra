package com.github.spocot.mythra;

public enum Direction {
	
	NEUTRAL(0,0),
	NORTH(0,-1),SOUTH(0,1),EAST(1,0),WEST(-1,0),
	NORTH_EAST(EAST.xVar(),NORTH.yVar()),NORTH_WEST(WEST.xVar(),NORTH.yVar()),
	SOUTH_EAST(EAST.xVar(),SOUTH.yVar()),SOUTH_WEST(WEST.xVar(),SOUTH.yVar());
	
	private int xVar;
	private int yVar;
	
	private Direction(int xVar, int yVar){
		this.xVar = xVar;
		this.yVar = yVar;
	}
	
	//Return x and y variations
	public int xVar(){return xVar;}
	public int yVar(){return yVar;}
}
