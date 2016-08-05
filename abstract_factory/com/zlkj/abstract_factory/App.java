package com.zlkj.abstract_factory;

public class App {
	private King king;
	private Castle castle;
	private Army army;
	
	/**
	 * creates kingdom
	 * @param factory
	 */
	public void createKingdom(final KingdomFactory factory){
		setKing(factory.createKing());
		setArmy(factory.createArmy());
		setCastle(factory.createCastle());
	}

	public King getKing(final KingdomFactory factory) {
		return factory.createKing();
	}
	
	public King getKing(){
		return king;
	}
	
	public void setKing(final King king) {
		this.king = king;
	}
	
	public App() {
		// TODO Auto-generated constructor stub
	}
	
	public Castle getCastle() {
		return castle;
	}
	
	public Castle getCastle(final KingdomFactory factory) {
		return factory.createCastle();
	}

	public void setCastle(final Castle castle) {
		this.castle = castle;
	}

	public Army getArmy() {
		return army;
	}
	
	public Army getArmy(final KingdomFactory factory) {
		return factory.createArmy();
	}


	public void setArmy(Army army) {
		this.army = army;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		System.out.println("Elf Kingdom");
		app.createKingdom(new ElfKingdomFactory());
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
		
		System.out.println("\nOrc Kingdom");
		app.createKingdom(new OrcKingdomFactory());
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
	}
}
