package org.ctw.kata.writer.utils;

public class EditingManager {
	
	public String erase(String toBeErased, String text) {
		String erased = "";
		
		if (text.contains(toBeErased)) {
			String numSpaces = countNumberOfSpaces(toBeErased);
			erased = text.replace(toBeErased, numSpaces);
		}
		
		return erased;
	}

	private String countNumberOfSpaces(String toBeErased) {
		StringBuilder spacesBuilder = new StringBuilder();
		int numSpaces = toBeErased.length();
		for (int i = numSpaces; i > 0; i--) {
			spacesBuilder.append(" ");
		}
		return spacesBuilder.toString();
	}

	public String edit(String toBeReplaced, String replacement, String text) {
		String edited = "";
		
		edited = text.replace(toBeReplaced, replacement);
		
		return edited;
	}
}
