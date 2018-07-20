package assessment;

public class Compass {
	
	private String direction;
	private int distance;
	
	
	
	public Compass() {
		
		Treasurelocation treasure1 = new Treasurelocation();
		this.direction = treasure1.getDirection();
		this.distance = treasure1.getDistance();
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
