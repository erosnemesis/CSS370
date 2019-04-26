package MicroController;

import Helpers.RandomGenerator;

/**
 * Stores GPS information
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class GPS {

	@Override
	/**
	 * Get a string representation of GPS info
	 * 
	 * @return string data
	 */
	public String toString() {
		return "Some GPS Data";
	}

	/**
	 * Generate some GPS coordinates to register
	 * 
	 * @return current GPS coordinates
	 */
	public String getCoordinates(){
		RandomGenerator rand = RandomGenerator.getInstance();
		String coordinates = "";
		for (int i = 0; i < 6; i++) {
			if (i ==3) {
				coordinates += ".";
			}
			coordinates += rand.getRandomInt() % 10;

		}
		coordinates += " lat:";
		for (int i = 0; i < 6; i++) {
			if (i ==3) {
				coordinates += ".";
			}
			coordinates += rand.getRandomInt() % 10;

		}
		return coordinates;
	}
}