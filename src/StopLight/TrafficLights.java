package StopLight;

import java.util.ArrayList;
import java.util.HashMap;

public class TrafficLights {
	private ArrayList<Character> color = new ArrayList<>(3);
	private HashMap<Integer, Character> lights = new HashMap<Integer, Character>();

	TrafficLights(int numLights){

		color.add('R');
		color.add('Y');
		color.add('G');

		for(int i = 0; i < numLights; i++){
			lights.put(i, color.get(0));
		}

	}

	public char getLightStatus(int lightId){
		return lights.get(lightId);
	}

	public void setLightStatus(int lightId, char color){
		if(!this.color.contains(color)){
			throw new ArrayStoreException();
		}

		lights.replace(lightId, color);
	}
	
	@Override
	public String toString() {
		String lightString = "";
		for (int i: lights.keySet()) {
			lightString += "light " + i + " is " + lights.get(i) + " ";
		}
		return lightString;
	}
}
