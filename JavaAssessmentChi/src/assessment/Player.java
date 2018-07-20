package assessment;

import java.util.Random;
import java.util.Scanner;

public class Player {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public String looking() {
		
		String isLooking = sc.nextLine();
		
		if(isLooking.equals("Look")) {
			//text is placeholder
			return "You feel like a million eyes are watching you, you decide that you NEED to move now. Which way will you go?";
		}
		else {
			
			return "What are you doing?! You need to look around.";
		}	
    }
	

	public String findCompass() {
		
		String pickDirection = sc.nextLine();

		if(pickDirection.equals("North")||pickDirection.equals("South")||pickDirection.equals("East")||pickDirection.equals("West")) {
			
			return "You are about to set off when you notice you have a strange compass in your pocket, ";
		}	
		else {
			
			return "You can't stay here! You need to pick a direction: North, South, East or West.";
		}	
    }	
	
	public int findTreasure(Compass magicCompass) {
		
		String pickDirection = sc.nextLine();
		int distanceTravelled = rand.nextInt(25) + 1;
		String treasureDirection = magicCompass.getDirection();
		int treasureDistance = magicCompass.getDistance();
		
		if(pickDirection.equals("North")||pickDirection.equals("South")||pickDirection.equals("East")||pickDirection.equals("West")) {
			
			if(treasureDirection.equals(pickDirection)) {
				
				if(treasureDistance - distanceTravelled <=0) {
					System.out.println("You find a portal that takes you back to QA. congratulations....");
					return 0;
				}
				else {
					magicCompass.setDistance(treasureDistance - distanceTravelled);
					return magicCompass.getDistance();
				}

			}
			else {
				
				magicCompass.setDistance(treasureDistance + distanceTravelled);
				return magicCompass.getDistance();
			}
		}
		else {
			System.out.println("You need to move for the compass to change: North, South, East or West");
			return treasureDistance;
		}
		

	}
}