package com.zlkj.adapter;

public class Captain implements Battleship {
	
	private Battleship battleship;
	
	public Captain() {
	}

	public Captain(Battleship battleship){
		this.battleship = battleship;
	}
	
	
	public Battleship getBattleship() {
		return battleship;
	}

	public void setBattleship(Battleship battleship) {
		this.battleship = battleship;
	}

	@Override
	public void fire() {
		battleship.fire();
	}

	@Override
	public void move() {
		battleship.move();
	}

}
