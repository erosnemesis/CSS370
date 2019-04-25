package StopLight;

public class IrSensor {
	private Pedestrian pedestrian;
	private boolean[] pedestrianArray;
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
