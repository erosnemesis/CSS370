package StopLight;
import java.util.ArrayList;
import java.util.List;

public class Intersection {
	private List<Road> roads;
	private List<IrSensor> irSensors;
	private TrafficLights trafficLights;

	private Intersection(){}

	public static class Builder{
		private ArrayList<Road> roads = new ArrayList<Road>();
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

		public Builder trafficLights(int numLights){
			this.trafficLights = new TrafficLights(numLights);
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