package com.zlkj.adapter;

public class App {
	public static void main(String[] args) {
		Captain captain = new Captain(new BattleFishingBoat());
		captain.move();
		captain.fire();
	}
}
