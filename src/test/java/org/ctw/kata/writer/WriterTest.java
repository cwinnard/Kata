package org.ctw.kata.writer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.ctw.kata.writer.utils.Degrader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WriterTest {
	
	@Mock
	Degrader mockDegrader;
	
	@InjectMocks
	Writer writer = new Writer();
	
	@Test
	public void testReturnsString() throws Exception {
		String written = writer.write("", "");
		assertTrue(written instanceof String);
	}
	
	@Test
	public void testReturnsInputString() throws Exception {
		String written = writer.write("1-2-1-2 this is just a test", "");
		assertThat(written, is("1-2-1-2 this is just a test"));
	}
	
	@Test
	public void testAddsInputToExisting() throws Exception {
		String written = writer.write("new text.", "existing text.");
		assertThat(written, is("existing text.new text."));
	}
	
	@Test
	public void testDegraderCountsWeightedLengthOfInputToWriter() throws Exception {
		when(mockDegrader.countInputLength(anyString())).thenReturn(5);
		String written = writer.write("", "");
		verify(mockDegrader).countInputLength(anyString());
	}
}
