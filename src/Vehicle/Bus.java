package Vehicle;

public class Bus extends VehicleImpl {

	final private static int PRIORITY = 12; // weight for assigning light timings

	private int year;
	private String busNumber;

	Bus(int id, String make, String model){
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

	public String getBusNumber(){
		return this.busNumber;
	}

	public void setBusNumber(String busNumber){
		this.busNumber = busNumber;
	}
	
	public String toString() {
		return super.toString() + ", type bus";
	}
}