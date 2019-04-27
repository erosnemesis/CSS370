import StopLight.ControlBox;
import StopLight.Intersection;

import MicroController.*;

/**
 * Simulates the traffic light control system
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Driver {
	/**
	 * Creates an intersection and a control box then simulates some vehicles
	 * entering and leaving the intersection and corresponding light settings
	 * 
	 * @param args NONE
	 */
	public static void main(String args[]){

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
		
		// create some microcontrollers associated with various vehicles
		MicroController m1 = new MicroController("Car", "BMW", "X5");
		MicroController m2 = new MicroController("Car", "Honda", "Civic");
		MicroController m3 = new MicroController("Car", "Subaru", "Outback");
		MicroController m4 = new MicroController("Bus", "TTC", "Orion VII");
		
		MicroController m5  = new MicroController("EMERGENCY", "X", "Y");

		
		// vehicle enters the area of the intersection
		controlBox.getDigitalModel().addMicroController(m1);
		System.out.println();
		controlBox.getDigitalModel().addMicroController(m2);
		System.out.println();
		
		// after a certain interval the control box calculates what the lights should be
		controlBox.pushLightColors();
		System.out.println();
		
		// vehicle exits the intersection
		controlBox.getDigitalModel().removeMicroController(m1);
		System.out.println();
		
		// some other vehicles enter the intersection
		controlBox.getDigitalModel().addMicroController(m3);
		System.out.println();
		controlBox.getDigitalModel().addMicroController(m4);
		System.out.println();
		
		// calculates light settings again
		controlBox.pushLightColors();
		System.out.println();
		
		// rest of the vehicles leave the intersection
		controlBox.getDigitalModel().removeMicroController(m2);
		System.out.println();
		controlBox.getDigitalModel().removeMicroController(m3);
		System.out.println();
		controlBox.getDigitalModel().removeMicroController(m4);
		System.out.println();
		
		// testing emergency vehicle decorator
		controlBox.getDigitalModel().addMicroController(m5);
		System.out.println();
		controlBox.getDigitalModel().removeMicroController(m5);





	}
}