package Vehicle;

/**
 * Abstract class to implement core functionality for vehicles
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public abstract class VehicleImpl implements Vehicle {

	private int id;
	private String make;
	private String model;

	/**
	 * Constructor to create a vehicle
	 * @param id vehicle RF ID
	 * @param make vehicle make
	 * @param model vehicle model
	 */
	VehicleImpl(int id, String make, String model){
		this.id = id;
		this.make = make;
		this.model = model;
	}

	/**
	 * get the ID of the vehicle
	 * @return id
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * Get the make of the vehicle
	 * @return string
	 */
	public String getMake(){
		return this.make;
	}

	/**
	 * Get model of the vehicle
	 * @return string
	 */
	public String getModel(){
		return this.model;
	}
	
	@Override
	public String toString() {
		return "vehicle with make " + make + ", model " + model;
	}
}