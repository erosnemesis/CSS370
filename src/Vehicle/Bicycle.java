package Vehicle;

/**
 * Representation of a bicycle
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Bicycle extends VehicleImpl {
	final private static int PRIORITY = 2; // weight for assigning light timings

	/**
	 * Constructor for a bicycle
	 * @param id
	 * @param make
	 * @param model
	 */
	Bicycle(int id, String make, String model){
		super(id, make, model);
	}

	/**
	 * Get the priority of the bicycle
	 * @return priority
	 */
	public int getPriority(){
		return PRIORITY;
	}
	
	/**
	 * Get String representation
	 * @return String
	 */
	public String toString() {
		return super.toString() + ", type bicycle";
	}
}