package Vehicle;

/**
 * Bus object
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class Bus extends VehicleImpl {

	final private static int PRIORITY = 12; // weight for assigning light timings

	private int year;
	private String busNumber;

	/**
	 * Bus constructor
	 * @param id bus id
	 * @param make bus make
	 * @param model bus model
	 */
	Bus(int id, String make, String model){
		super(id, make, model);
	}

	/**
	 * Get the priority of the bus
	 * 
	 * @return priority
	 */
	public int getPriority(){
		return PRIORITY;
	}

	/**
	 * Get the year of the bus
	 * @return year
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * Set the year of the bus
	 * @param year bus year
	 */
	public void setYear(int year){
		this.year = year;
	}

	/**
	 * Get the bus number
	 * @return bus number
	 */
	public String getBusNumber(){
		return this.busNumber;
	}

	/**
	 * Set the current bus number
	 * @param busNumber bus number to be set
	 */
	public void setBusNumber(String busNumber){
		this.busNumber = busNumber;
	}
	
	@Override
	/**
	 * Get a string of all bus details
	 * @return string
	 */
	public String toString() {
		return super.toString() + ", type bus";
	}
}