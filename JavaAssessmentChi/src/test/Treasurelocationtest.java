package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import assessment.Treasurelocation;

public class Treasurelocationtest {
	
	@Test
	public void treasureTest() {
		Treasurelocation testLocation = new Treasurelocation();
		testLocation.setDirection("South");
		assertEquals("This location has not set South", testLocation.getDirection(), "South");
	}
	
	@Test
	public void treasureSetGetTest() {
		Treasurelocation testLocation = new Treasurelocation();
		
		assertTrue("This compass does not have a valid direction", testLocation.getDirection().equals("North")
				|| testLocation.getDirection().equals("South")
				|| testLocation.getDirection().equals("East")
				||testLocation.getDirection().equals("West"));
	}
}
