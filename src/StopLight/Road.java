package StopLight;

public class Road {
	private int numberOfLanes;
	private boolean turnLane;
	private int width;
	private char cardinal;
	private int speedLimit;

	public Road(int numberOfLanes,
				boolean turnLane,
				int width,
				char cardinal,
				int speedLimit){
		this.numberOfLanes = numberOfLanes;
		this.turnLane = turnLane;
		this.width = width;
		this.cardinal = cardinal;
		this.speedLimit = speedLimit;
	}

	public int getNumberOfLanes(){
		return this.numberOfLanes;
	}

	public boolean hasTurnLane(){
		return this.turnLane;
	}

	public int getWidth(){
		return this.width;
	}

	public char getCardinalDirection(){
		return this.cardinal;
	}

	public int getSpeedLimit(){
		return this.speedLimit;
	}
}