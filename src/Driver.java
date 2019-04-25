import StopLight.ControlBox;
import StopLight.Intersection;

import StopLight.*;
import MicroController.*;

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
				.trafficLights(numLights)
				.build();

		ControlBox controlBox = new ControlBox(intersection);
		
		MicroController m1 = new MicroController("Car", "BMW", "X5");
		MicroController m2 = new MicroController("Car", "Honda", "Civic");
		MicroController m3 = new MicroController("Car", "Subaru", "Outback");
		MicroController m4 = new MicroController("Bus", "TTC", "Orion VII");

		
		// vehicle enters the area of the intersection
		controlBox.getDigitalModel().addMicroController(m1);
		System.out.println();
		controlBox.getDigitalModel().addMicroController(m2);
		System.out.println();
		
		controlBox.pushLightColors();
		System.out.println();
		
		// vehicle exits the intersection
		controlBox.getDigitalModel().removeMicroController(m1);
		System.out.println();
		controlBox.getDigitalModel().addMicroController(m3);
		System.out.println();
		controlBox.getDigitalModel().addMicroController(m4);
		System.out.println();
		
		controlBox.pushLightColors();
		System.out.println();
		
		controlBox.getDigitalModel().removeMicroController(m2);
		System.out.println();
		controlBox.getDigitalModel().removeMicroController(m3);
		System.out.println();
		controlBox.getDigitalModel().removeMicroController(m4);
		System.out.println();







	}
}