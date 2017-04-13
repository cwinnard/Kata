package org.ctw.kata.writer.utils;

public class EditingManager {
	
	public String erase(String toBeErased, String text) {
		String erased = "";
		
		if (text.contains(toBeErased)) {
			erased = text.replace(toBeErased, "     ");
		}
		
		return erased;
	}
}
