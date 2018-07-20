package assessment_test;

import static org.junit.Assert.*;

import org.junit.Test;

import assessment.Compass;

public class Compasstest {
	
	@Test
	public void compassTest() {
		Compass testCompass = new Compass();
		
		assertTrue("This compass does not have a valid direction", testCompass.getDirection().equals("North")
				|| testCompass.getDirection().equals("South")
				|| testCompass.getDirection().equals("East")
				||testCompass.getDirection().equals("West"));
	}

}
