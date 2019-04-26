package Vehicle;

/**
 * Object to represent a car
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Car extends VehicleImpl {

	/*
	add decorator pattern for emergency vehicles
	 */

	final private static int PRIORITY = 4; // weight for assigning light timings

	private int year;

	/**
	 * Constructor
	 * @param id car rf id
	 * @param make car make
	 * @param model car model
	 */
	Car(int id, String make, String model){
		super(id, make, model);
	}

	/**
	 * Get the priority of the car
	 * @return car priority
	 */
	public int getPriority(){
		return PRIORITY;
	}

	/**
	 * Get the car's year
	 * @return car year
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * Set the year of the car
	 * @param year car year
	 */
	public void setYear(int year){
		this.year = year;
	}
	
	@Override
	/**
	 * Generates a string version of car
	 * @return string
	 */
	public String toString() {
		return super.toString() + ", type car"; 
	}

}