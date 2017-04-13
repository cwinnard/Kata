package org.ctw.kata.writer.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EditingManagerTest {
	
	EditingManager editor = new EditingManager();
	
	@Test
	public void testEraseRemovesString() throws Exception {
		String erased = editor.erase("erase", "this should be erased");
		assertThat(erased, is("this should be      d"));
	}
	
	@Test
	public void testEraseRemovesString_OfLengthOtherThan5() throws Exception {
		String erased = editor.erase("begone demon string", "he said begone demon string, to hell with you!");
		assertThat(erased, is("he said                    , to hell with you!"));
	}
}
