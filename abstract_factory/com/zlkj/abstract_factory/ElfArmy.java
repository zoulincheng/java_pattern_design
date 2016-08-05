package com.zlkj.abstract_factory;

public class ElfArmy implements Army {
	public static final String DESCRIPTION = "This is the Elf Army";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
