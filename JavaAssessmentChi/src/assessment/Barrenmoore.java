package assessment;

public class Barrenmoore {
	
	public void barrenMooreGame() {
		
		Player p = new Player();
		System.out.println("You find yourself in a barren moore, you have no idea where you are or how you got here. Try to look aroud.");
		
        String look = "";
		
	    do {
			look = p.looking();
			System.out.println(look);
		} while(look.equals("What are you doing?! You need to look around."));
		
		
	    String find = "";
		
		do {
			find = p.findCompass();
		    System.out.println(find);  
		}while(find.equals("You can't stay here! You need to pick a direction: North, South, East or West."));
		
		
        Compass magicComp = new Compass();
		
		do {
			
			System.out.println("The dial shows: " + magicComp.getDistance() + "m \nWhich way will you go?");
			magicComp.setDistance(p.findTreasure(magicComp)); 
			
		}while(magicComp.getDistance() > 0);
	}

}
