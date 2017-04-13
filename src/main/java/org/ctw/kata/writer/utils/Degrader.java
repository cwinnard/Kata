package org.ctw.kata.writer.utils;

public class Degrader {

	public int countInputLength(String input) {
		int weightedLength = 0;
		char[] characters = input.toCharArray();
		for (char c: characters) {
			if (c == ' ') {
				continue;
			}
			weightedLength++;
		}
		return weightedLength;
	}
	
}
