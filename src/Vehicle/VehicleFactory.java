package Vehicle;

/**
 * Generates a car, bus, or bicycle based on input
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class VehicleFactory {

	private VehicleFactory(){}

	/**
	 * Function to create a certain type of vehicle
	 * @param type vehicle type
	 * @param id vehicle id
	 * @param make vehicle make
	 * @param model vehicle model
	 * @return reference to vehicle
	 */
	public static Vehicle getVehicle(String type,
									 int id,
									 String make,
									 String model){

		switch(type){
			case "Bicycle":
				return new Bicycle(id, make, model);
			case "Bus":
				return new Bus(id, make, model);
			case "Car":
				return new Car(id, make, model);
			default:
				return null;
		}
	}
}