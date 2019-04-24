package Vehicle;

public class VehicleFactory {

	private VehicleFactory(){}

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