package MicroController;

import Helpers.RandomGenerator;

public class Accelerometer {

	@Override
	public String toString() {
		return "Some Accelerometer Data";
	}

	public double getSpeed(){
		return RandomGenerator.getInstance().getRandomSpeed();
	}
}
