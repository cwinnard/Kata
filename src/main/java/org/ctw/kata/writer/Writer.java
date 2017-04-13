package org.ctw.kata.writer;

public class Writer {
	
	public String write(String input, String existingText) {
		StringBuilder sb = new StringBuilder(existingText);
		return sb.append(input).toString();
	}
}
