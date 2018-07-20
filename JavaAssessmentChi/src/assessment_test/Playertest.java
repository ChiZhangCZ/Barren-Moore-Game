package assessment_test;

import static org.junit.Assert.*;

import org.junit.Test;

import assessment.Compass;
import assessment.Player;

public class Playertest {
	
	@Test
	public void lookingTest() {
		Player p = new Player();
		//Input Look
		assertEquals("The text was not returned correctly", p.looking(), "You feel like a million eyes are watching you, you decide that you NEED to move now. Which way will you go?");
		//Don't input Look
		assertEquals("The text was not returned correctly", p.looking(), "What are you doing?! You need to look around.");
	}
	
	@Test
	public void findCompassTest() {
		Player p = new Player();
		//Input North, East, South and West
		assertEquals("The text was not returned correctly", p.findCompass(), "You are about to set off when you notice you have a strange compass in your pocket, ");
		assertEquals("The text was not returned correctly", p.findCompass(), "You are about to set off when you notice you have a strange compass in your pocket, ");
		assertEquals("The text was not returned correctly", p.findCompass(), "You are about to set off when you notice you have a strange compass in your pocket, ");
		assertEquals("The text was not returned correctly", p.findCompass(), "You are about to set off when you notice you have a strange compass in your pocket, ");
		//Don't input North, East, South or West
		assertEquals("The text was not returned correctly", p.findCompass(), "You can't stay here! You need to pick a direction: North, South, East or West.");
	}
	
	@Test
	public void findTreasureTest() {
		Player p = new Player();
		Compass testCompass = new Compass();
		int distance = testCompass.getDistance();
		//Input North, East, South and West
		assertTrue("The distance to treasure was not calculated correctly", p.findTreasure(testCompass) != distance);
		assertTrue("The distance to treasure was not calculated correctly", p.findTreasure(testCompass) != distance);
		assertTrue("The distance to treasure was not calculated correctly", p.findTreasure(testCompass) != distance);
		assertTrue("The distance to treasure was not calculated correctly", p.findTreasure(testCompass) != distance);
		////Don't input North, East, South or West
		assertTrue("The distance to treasure was not calculated correctly", p.findTreasure(testCompass) == testCompass.getDistance());
	}

}
