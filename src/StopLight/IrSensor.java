package StopLight;

import java.util.ArrayList;

/**
 * Sensor to detect pedestrians
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class IrSensor {
	private Pedestrian pedestrian;
	private ArrayList<Boolean> pedestrianArray;
	final private static int PRIORITY = 5;

	/**
	 * Returns the pedestrian priority
	 * 
	 * @return priority value
	 */
	public static int getPriority() {
		return PRIORITY;
	}

	/**
	 * Detects pedestrians
	 * @param ped pedestrian to add
	 * @return boolean whether a pedestrian was added
	 */
	boolean seeObject( Pedestrian ped ){
		if(ped == null)
			return false;
		pedestrianArray.add(true);
		return true;
	}
}
