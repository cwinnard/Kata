package org.ctw.kata.writer.utils;

public class EditingManager {
	
	public String erase(String toBeErased, String text) {
		String erased = "";
		
		if (text.contains(toBeErased)) {
			StringBuilder spacesBuilder = new StringBuilder();
			int numSpaces = toBeErased.length();
			for (int i = numSpaces; i > 0; i--) {
				spacesBuilder.append(" ");
			}
			
			erased = text.replace(toBeErased, spacesBuilder.toString());
		}
		
		return erased;
	}
}
