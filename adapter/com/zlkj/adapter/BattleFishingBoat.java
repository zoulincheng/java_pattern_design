package com.zlkj.adapter;

public class BattleFishingBoat implements Battleship {

	private FishingBoat boat;
	
	public BattleFishingBoat() {
		boat = new FishingBoat();
	}
	
	@Override
	public void fire() {
		System.out.println("fire!");
	}

	@Override
	public void move() {
		boat.sail();
	}
}
