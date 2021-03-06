package org.ctw.kata.writer.utils;

public class DurabilityManager {
	
	public int durability = 30;

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

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
		return this.countInputLength(input) <= this.durability;
	}

	public int dull(String input) {
		this.durability = this.durability - this.countInputLength(input);
		return this.durability;
	}

	public int sharpen() {
		this.durability = 30;
		return this.durability;
	}
}
