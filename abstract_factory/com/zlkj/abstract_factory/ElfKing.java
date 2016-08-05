package com.zlkj.abstract_factory;

public class ElfKing implements King {
	public static final String DESCRIPTION = "This is the Elf King!";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
