package Vehicle;

public class Car extends VehicleImpl {

	final private static int PRIORITY = 4; // weight for assigning light timings

	private int year;

	Car(int id, String make, String model){
		super(id, make, model);
	}

	public int getPriority(){
		return PRIORITY;
	}

	public int getYear(){
		return this.year;
	}

	public void setYear(int year){
		this.year = year;
	}

}