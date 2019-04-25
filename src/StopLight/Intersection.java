package StopLight;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Intersection {
	private List<Road> roads;
	private List<IrSensor> irSensors;
	private TrafficLights trafficLights;

	private Intersection(){}

	public static class Builder{
		private List<Road> roads = new ArrayList<Road>();
		private List<IrSensor> irSensors = new ArrayList<IrSensor>();
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