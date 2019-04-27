package Vehicle;

/**
 * Decorates a vehicle to be an emergency vehicle
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class EmergencyDecorator implements Vehicle {
	protected Vehicle emergencyVehicle;
	
	/**
	 * Constructs and EmergencyDecorator
	 * 
	 * @param emergencyVehicle vehicle base
	 */
	public EmergencyDecorator(Vehicle emergencyVehicle) {
		this.emergencyVehicle = emergencyVehicle;
	}
	
	/**
	 * Get vehicle id
	 * @return vehicle id
	 */
	public int getId() {
		return emergencyVehicle.getId();
	}
	
	/**
	 * Get vehicle Model
	 * @return vehicle model
	 */
	public String getModel() {
		return emergencyVehicle.getModel();
	}
	
	/**
	 * Get vehicle make
	 * @return vehicle make
	 */
	public String getMake() {
		return emergencyVehicle.getMake();
	}
	
	/**
	 * Get vehicle priorty
	 * Returns a much higher priority than all other vehicles
	 * @return priority
	 */
	public int getPriority() {
		return 200;
	}
	
	/**
	 * Get string representation of the vehicle
	 * @return string
	 */
	public String toString() {
		return emergencyVehicle.toString() + " and is an emergency vehicle";
	}
}
