package com.zlkj.abstract_factory;

public class OrcCastle implements Castle {
	public static final String DESCRIPTION = "This is the Orc Castle";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
