package assessment;

import java.util.Random;

public class Compass {
	
	private String direction;
	
	public Compass() {
		Random rand = new Random();
		int  randDirection = rand.nextInt(4) + 1;
		
		switch(randDirection) {
		case 1:
			this.direction = "North";
			break;
			
		case 2:
			this.direction = "South";
			break;
			
		case 3:
			this.direction = "East";
			break;
			
		case 4:
			this.direction = "West";
			break;
		
		}
		
		
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}


}
