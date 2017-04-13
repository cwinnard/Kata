package org.ctw.kata.writer.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DurabilityManagerTest {
	
	DurabilityManager degrader = new DurabilityManager();
	
	@Test
	public void testCountsInput() throws Exception {
		int stringLength = degrader.countInputLength("12345");
		assertThat(stringLength, is(5));
	}
	
	@Test
	public void testCountsInput_Assigns0ToSpaces() throws Exception {
		int lengthSansSpaces = degrader.countInputLength("123 456");
		assertThat(lengthSansSpaces, is(6));
	}
	
	@Test
	public void testCountsInput_Assigns2ToCapitalLetters() throws Exception {
		int lengthConsideringCapitals = degrader.countInputLength("abcDEF");
		assertThat(lengthConsideringCapitals, is(9));
	}
	
	@Test
	public void testCountsInput_Assigns2ToCapitalLetters_WhereInputsAreEdgeCases() throws Exception {
		int weightedLength = degrader.countInputLength("AA aa ZZ zz");
		assertThat(weightedLength, is(12));
	}
	
	@Test
	public void testShouldReturnTrue_WhileInputStringLengthLessThanDurability() throws Exception {
		boolean writable = degrader.shouldWrite("test");
		assertTrue(writable);
	}
	
	@Test
	public void testShouldReturnFalse_WhileInputStringGreaterThanDurability() throws Exception {
		boolean writable = degrader.shouldWrite("1234567890123456789012345678901234567890");
		assertFalse(writable);
	}
	
	@Test
	public void testDull_ReducesDurabilityEqualToWeightedLengthOfInput() throws Exception {
		int durability = degrader.dull("12345");
		assertThat(durability, is(25));
	}
}
