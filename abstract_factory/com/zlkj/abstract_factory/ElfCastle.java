package com.zlkj.abstract_factory;

public class ElfCastle implements Castle {
	public static final String DESCRIPTION = "This is the Elf Castle";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
