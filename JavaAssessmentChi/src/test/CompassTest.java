package test;

import static org.junit.Assert.*;

import org.junit.Test;

import assessment.Compass;

public class CompassTest {
	
	@Test
	public void compassSetGetTest() {
		Compass testCompass = new Compass();
        testCompass.setDirection("North");
		assertTrue("The compass does not set its direction peroperly", testCompass.getDirection().equals("North"));
		testCompass.setDistance(40);
		assertTrue("The compass does not set its distance properly", testCompass.getDistance() == 40);
	}

}
