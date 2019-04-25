package Vehicle;

public abstract class VehicleImpl implements Vehicle {

	private int id;
	private String make;
	private String model;

	VehicleImpl(int id, String make, String model){
		this.id = id;
		this.make = make;
		this.model = model;
	}

	public int getId(){
		return this.id;
	}

	public String getMake(){
		return this.make;
	}

	public String getModel(){
		return this.model;
	}
	
	public String toString() {
		return "vehicle with make " + make + ", model " + model;
	}
}