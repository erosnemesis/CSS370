import StopLight.ControlBox;
import StopLight.Intersection;

public class Driver {
	public static void main(String args[]){
		// implement driver
		// Intersection builder...pass intersection to controlBox

		//define a single intersection
		short numRoads = 4;
		short[] numLanes = {2, 2, 2, 2};
		boolean[] turnLane = {true, true, true, true};
		int[] width = {75, 75, 75, 75};
		char[] cardinal = {'N', 'S', 'E', 'W'};
		int[] speedLimit = {35, 35, 45, 45};

		short numSensors = 8;
		int numLights = 4;

		Intersection intersection = new Intersection.Builder()
				.addRoads(numRoads, numLanes, turnLane, width, cardinal, speedLimit)
				.addIrSensors(numSensors)
				.trafficLights(4)
				.build();

		ControlBox controlBox = new ControlBox(intersection);


	}
}