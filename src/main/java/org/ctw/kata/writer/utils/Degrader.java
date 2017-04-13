package org.ctw.kata.writer.utils;

public class Degrader {
	
	private int durability = 30;

	public int countInputLength(String input) {
		int weightedLength = 0;
		char[] characters = input.toCharArray();
		for (char c : characters) {
			int intValue = c;
			if (intValue == 32) {
				continue;
			}
			if (65 <= intValue && intValue <= 96) {
				weightedLength += 2;
			} else {
				weightedLength++;
			}
		}
		return weightedLength;
	}

	public boolean shouldWrite(String input) {
		return input.length() <= durability;
	}
}
