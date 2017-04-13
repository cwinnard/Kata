package org.ctw.kata.writer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WriterTest {
	
	@InjectMocks
	Writer writer = new Writer();
	
	@Test
	public void testReturnsString() throws Exception {
		String written = writer.write("");
		assertTrue(written instanceof String);
	}
	
	@Test
	public void testReturnsInputString() throws Exception {
		String written = writer.write("1-2-1-2 this is just a test");
		assertThat(written, is("1-2-1-2 this is just a test"));
	}
}
