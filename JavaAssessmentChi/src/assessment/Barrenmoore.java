package assessment;

import java.util.Scanner;

public class Barrenmoore {
	
	Scanner sc = new Scanner(System.in);
	
	public String looking() {
		
		System.out.println("You find yourself in a barren moore, you have no idea where you are or how you got here. Try to look aroud.");
		
		String isLooking = sc.nextLine();
		
		if(isLooking.equals("Look")) {
			//text is placeholder
			return "Stuff is around you";
		}
		else {
			
			return "What are you doing?! You need to look around.";
		}	
	}
	
	public String findCompass() {
		
		String lookCheck = looking();
		System.out.println(lookCheck);
		String pickDirection = sc.nextLine();
		
		if(lookCheck.equals("Stuff is around you")) {
			System.out.println();
			
			if(pickDirection.equals("North")||pickDirection.equals("South")||pickDirection.equals("East")||pickDirection.equals("West")) {
				
				return "You find a Compass";
			}
		}
		
		return "You can't stay here! You need to pick a direction: North, South, East or West.";
	}

}
