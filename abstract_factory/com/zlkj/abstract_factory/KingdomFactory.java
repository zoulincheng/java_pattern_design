package com.zlkj.abstract_factory;

public interface KingdomFactory {
	Castle createCastle();
	King createKing();
	Army createArmy();
}
