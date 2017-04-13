package org.ctw.kata.writer.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DegraderTest {
	
	Degrader degrader = new Degrader();
	
	@Test
	public void testCountsInput() throws Exception {
		int stringLength = degrader.countInputLength("12345");
		assertThat(stringLength, is(5));
	}
}
