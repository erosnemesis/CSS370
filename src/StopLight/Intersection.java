package StopLight;
import java.util.List;

public class Intersection {
	private List<Road> roads;
	private List<IrSensor> irSensors;
	private TrafficLights trafficLights;

	/*
	This should be a builder class

	Intersection.roads().irSensors().trafficLights.build();
	 */

	private Intersection(){}

	public static class Builder{
		private List<Road> roads;
		private List<IrSensor> irSensors;
		private TrafficLights trafficLights;

		//
		public Builder addRoads(short numRoads, short[] numLanes, boolean[] turnLane, int[] width, char[] cardinal, int[] speedLimit){
			for(int i = 0; i < numRoads; i++){
				Road r = new Road(numLanes[i], turnLane[i], width[i], cardinal[i], speedLimit[i]);
				this.roads.add(r);
			}
			return this;
		}

		public Builder addIrSensors(short numSensors){
			for(int i = 0; i < numSensors; i++){
				IrSensor is = new IrSensor();
				this.irSensors.add(is);
			}
			return this;
		}

		public Builder trafficLights(){
			TrafficLights t = new TrafficLights();
			this.trafficLights = t;
			return this;
		}

		public Intersection build(){
			Intersection intersection = new Intersection();
			intersection.roads = this.roads;
			intersection.irSensors = this.irSensors;
			intersection.trafficLights = this.trafficLights;

			return intersection;
		}
	}
}