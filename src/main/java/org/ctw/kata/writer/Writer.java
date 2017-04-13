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
		while (durabilityManager.durability > 0) {
			sb.append(inputChars[charCounter]);
			durabilityManager.dull(String.valueOf(inputChars[charCounter]));
		}
		
		return sb.toString();
	}
}
