package StopLight;

import java.util.ArrayList;

public class IrSensor {
	private Pedestrian pedestrian;
	private ArrayList<Boolean> pedestrianArray;
	final private static int PRIORITY = 5;

	public static int getPriority() {
		return PRIORITY;
	}

	/*
	if IrSensor sees a pedestrian, add true to the pedestrianArray,
	otherwise, return false
	 */
	boolean seeObject( Pedestrian ped ){
		if(ped == null)
			return false;
		pedestrianArray.add(true);
		return true;
	}
}
