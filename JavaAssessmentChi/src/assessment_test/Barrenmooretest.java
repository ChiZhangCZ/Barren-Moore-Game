package assessment_test;

import static org.junit.Assert.*;

import org.junit.Test;

import assessment.Barrenmoore;

public class Barrenmooretest {
	
	@Test
	public void lookingTest() {
		Barrenmoore bm = new Barrenmoore();
		assertEquals("The text was not returned correctly", bm.looking(), "Stuff is around you");
	}
	
	@Test
	public void findCompassTest() {
		Barrenmoore bm = new Barrenmoore();
		
	}

}
