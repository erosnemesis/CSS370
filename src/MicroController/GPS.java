package MicroController;

import Helpers.RandomGenerator;

public class GPS {

	@Override
	public String toString() {
		return "Some GPS Data";
	}

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