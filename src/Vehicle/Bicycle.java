package Vehicle;

public class Bicycle extends VehicleImpl {
	final private static int PRIORITY = 2; // weight for assigning light timings

	Bicycle(int id, String make, String model){
		super(id, make, model);
	}

	public int getPriority(){
		return PRIORITY;
	}
	
	public String toString() {
		return super.toString() + ", type bicycle";
	}
}