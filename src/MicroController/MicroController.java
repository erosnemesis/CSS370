package MicroController;

import Vehicle.*;

/**
 * Handles all information about a certain vehicle
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class MicroController {

	private Accelerometer accel;
	private GPS gps;
	private Gyroscope gyro;
	private RfTransmitter rf;
	private Vehicle vehicle;
	
	/**
	 * Generates a microcontroller based on some initial data
	 * 
	 * @param vehicleType vehicle associated with the controller
	 * @param make of vehicle connected to controller
	 * @param model of vehicle registered
	 */
	public MicroController(String vehicleType, String make, String model){
		this.accel = new Accelerometer();
		this.gps = new GPS();
		this.gyro = new Gyroscope();
		this.rf = new RfTransmitter();

		this.vehicle = VehicleFactory.getVehicle(vehicleType, this.rf.getId(), make, model);
	}
	
	/**
	 * Get the speed info for the vehicle
	 * 
	 * @return current speed
	 */
	public Accelerometer getAccelerometerData(){
		return this.accel;
	}

	/**
	 * Get the GPS data
	 * 
	 * @return current gps coordinates
	 */
	public GPS getGPSData(){
		return this.gps;
	}

	/**
	 * Get current gyro info
	 * 
	 * @return gyro information
	 */
	public Gyroscope getGyroscopeData(){
		return this.gyro;
	}

	/**
	 * Get rf transmitted connected to the microcontroller
	 * 
	 * @return rf data
	 */
	public RfTransmitter getRfData(){
		return this.rf;
	}

	/**
	 * Get the vehicle connected to the microcontroller
	 * 
	 * @return vehicle representation
	 */
	public Vehicle getVehicleData(){
		return this.vehicle;
	}
	
	@Override
	/**
	 * Converts the microcontroller into a string representation
	 * 
	 * @return string
	 */
	public String toString() {
		String microControllerString = "microcontroller with a speed of " + accel.getSpeed() 
			+ ", GPS " + gps.getCoordinates() + ", gyro " + gyro + ", rf ID " + rf.getId();
		microControllerString += "\nAssociated with a " + vehicle;
		return microControllerString;
	}
}
