package org.ctw.kata.writer;

import org.ctw.kata.writer.utils.DurabilityManager;

public class Writer {
	
	private DurabilityManager degrader;
	
	public String write(String input, String existingText) {
		StringBuilder sb = new StringBuilder(existingText);
		
		degrader.countInputLength(input);
		
		return sb.append(input).toString();
	}
}
