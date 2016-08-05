package com.zlkj.abstract_factory;

public class OrcKing implements King {
	public static final String DESCRIPTION = "This is the Orc King";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
