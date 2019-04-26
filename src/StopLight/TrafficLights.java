package StopLight;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Representation of the traffic lights at an intersection
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class TrafficLights {
	private ArrayList<Character> color = new ArrayList<>(3);
	private HashMap<Integer, Character> lights = new HashMap<Integer, Character>();

	/**
	 * Constructor to create a traffic light
	 * @param numLights
	 */
	public TrafficLights(int numLights){

		color.add('R');
		color.add('Y');
		color.add('G');

		for(int i = 0; i < numLights; i++){
			lights.put(i, color.get(0));
		}

	}

	/**
	 * Get the current status of a certain light
	 * 
	 * @param lightId light to check
	 * @return current light color
	 */
	public char getLightStatus(int lightId){
		return lights.get(lightId);
	}

	/**
	 * Set the light status of a light
	 * 
	 * @param lightId light to set
	 * @param color setting
	 */
	public void setLightStatus(int lightId, char color){
		if(!this.color.contains(color)){
			throw new ArrayStoreException();
		}

		lights.replace(lightId, color);
	}
	
	@Override
	/**
	 * String representation of traffic light
	 * 
	 * @return string representation
	 */
	public String toString() {
		String lightString = "";
		for (int i: lights.keySet()) {
			lightString += "light " + i + " is " + lights.get(i) + " ";
		}
		return lightString;
	}
}
