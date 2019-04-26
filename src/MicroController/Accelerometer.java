package MicroController;

import Helpers.RandomGenerator;

/**
 * Handles vehicle speed information
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Accelerometer {

	@Override
	/**
	 * Get a string representation of data
	 * 
	 * @return string
	 */
	public String toString() {
		return "Some Accelerometer Data";
	}

	/**
	 * Generates some speed data
	 * 
	 * @return current speed
	 */
	public double getSpeed(){
		return RandomGenerator.getInstance().getRandomSpeed();
	}
}
