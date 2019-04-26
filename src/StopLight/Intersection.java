package StopLight;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Object that represents the specific attributes of a physical intersection
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Intersection {
	private List<Road> roads;
	private List<IrSensor> irSensors;
	private TrafficLights trafficLights;
	
	/**
	 * Utilizes a builder pattern
	 */
	private Intersection(){}

	/**
	 * Builder class for an intersection to add relevant information
	 * 
	 * @author Robert, Trent, Jeffrey, Megan
	 *
	 */
	public static class Builder{
		private List<Road> roads = new ArrayList<Road>();
		private List<IrSensor> irSensors = new ArrayList<IrSensor>();
		private TrafficLights trafficLights;

		/**
		 * Adds roads to the intersection
		 * @param numRoads total number of roads
		 * @param numLanes total number of lanes
		 * @param turnLane which lanes are turn lanes
		 * @param width wdith of the roads
		 * @param cardinal directions associated with the roads
		 * @param speedLimit speed limits for the roads
		 * @return this reference
		 */
		public Builder addRoads(short numRoads, short[] numLanes, boolean[] turnLane, int[] width, char[] cardinal, int[] speedLimit){
			for(int i = 0; i < numRoads; i++){
				Road r = new Road(numLanes[i], turnLane[i], width[i], cardinal[i], speedLimit[i]);
				this.roads.add(r);
			}
			return this;
		}

		/**
		 * Adds a number of IR sensors for crosswalks
		 * @param numSensors total number of sensors
		 * @return builder reference
		 */
		public Builder addIrSensors(short numSensors){
			for(int i = 0; i < numSensors; i++){
				IrSensor is = new IrSensor();
				this.irSensors.add(is);
			}
			return this;
		}

		/**
		 * Adds a number of traffic lights to an intersection
		 * @param numLights total number of lights
		 * @return builder reference
		 */
		public Builder trafficLights(int numLights){
			this.trafficLights = new TrafficLights(numLights);
			return this;
		}
		
		/**
		 * Generate the intersection
		 * @return intersection
		 */
		public Intersection build(){
			Intersection intersection = new Intersection();
			intersection.roads = this.roads;
			intersection.irSensors = this.irSensors;
			intersection.trafficLights = this.trafficLights;

			return intersection;
		}
	}
	
	/**
	 * Setting the light colors associated with this intersection
	 * 
	 * @param timings
	 */
	public void setTrafficLights(String timings) {
		System.out.println("Traffic light settings sent to traffic light");
		char even = 'R';
		char odd = 'G';
		if (trafficLights.getLightStatus(0) == 'R') {
			even = 'G';
			odd = 'R';
		}
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				trafficLights.setLightStatus(i, even);
			} else {
				trafficLights.setLightStatus(i, odd);
			}
		}
		System.out.println("Current traffic light settings are " + trafficLights);
	}
}