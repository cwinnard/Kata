package org.ctw.kata.writer;

import org.ctw.kata.writer.utils.DurabilityManager;

public class Writer {
	
	private DurabilityManager durabilityManager;
	
	public String write(String input, String existingText) {
		StringBuilder sb = new StringBuilder(existingText);
		char[] inputChars = input.toCharArray();
		
		//TODO: This will probably be removed, relic of previous tests.  
		durabilityManager.countInputLength(input);
		
		int charCounter = 0;
		
		//In a bad spot using the durability manager property here.  Logic is sound, but struggling with the mock
		int durability = durabilityManager.getDurability();
		while (durability > 0) {
			sb.append(inputChars[charCounter]);
			durability = durabilityManager.dull(String.valueOf(inputChars[charCounter]));
			charCounter++;
		}
		
		return sb.toString();
	}
}
