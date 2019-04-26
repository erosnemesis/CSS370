package StopLight;

/**
 * Represents a physical road
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Road {
	private int numberOfLanes;
	private boolean turnLane;
	private int width;
	private char cardinal;
	private int speedLimit;

	/**
	 * Constructor to establish all aspects of a road
	 * 
	 * @param numberOfLanes total number of lanes
	 * @param turnLane whether it is a turn lane
	 * @param width how wide the road is
	 * @param cardinal direction of the road
	 * @param speedLimit speed limit of road
	 */
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

	/**
	 * Get total number of lanes
	 * @return total number of lanes
	 */
	public int getNumberOfLanes(){
		return this.numberOfLanes;
	}

	/**
	 * Get whether the road is a turn lane or not
	 * @return true if turn lane, false otherwise
	 */
	public boolean hasTurnLane(){
		return this.turnLane;
	}

	/**
	 * Get the width of the road
	 * @return road width
	 */
	public int getWidth(){
		return this.width;
	}

	/**
	 * Direction of the road
	 * @return cardinal direction
	 */
	public char getCardinalDirection(){
		return this.cardinal;
	}

	/**
	 * Get the road's speed limit
	 * @return speed limit
	 */
	public int getSpeedLimit(){
		return this.speedLimit;
	}
}