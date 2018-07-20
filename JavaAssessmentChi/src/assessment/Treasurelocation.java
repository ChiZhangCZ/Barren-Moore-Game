package assessment;

import java.util.Random;

public class Treasurelocation {
	
	private String direction;
	private int distance;
	
	public Treasurelocation() {
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
		
		int randDistance = rand.nextInt(30) + 20;
		this.distance = randDistance;
		
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	


}
