package com.zlkj.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.zlkj.adapter.BattleFishingBoat;
import com.zlkj.adapter.Battleship;
import com.zlkj.adapter.Captain;


public class AdapterPatternTest {
	private Map<String, Object> beans;
	
	private static final String BATTLESHIP_BEAN = "engineer";
	
	private static final String CAPTAIN_BEAN = "captain";
	
	@Before
	public void setup(){
		beans = new HashMap<>();
		
		BattleFishingBoat battleFishingBoat = new BattleFishingBoat();
		beans.put(BATTLESHIP_BEAN,  battleFishingBoat);
		
		Captain captain = new Captain();
		captain.setBattleship((BattleFishingBoat)beans.get(BATTLESHIP_BEAN));
		beans.put(CAPTAIN_BEAN, captain);
	}
	
	@Test
	public void testAdapter(){
		Battleship captain = (Battleship) beans.get(CAPTAIN_BEAN);
		captain.move();
		
		Battleship battleship = (Battleship) beans.get(BATTLESHIP_BEAN);
		battleship.move();
		
		captain.fire();
		battleship.fire();
	}
}
