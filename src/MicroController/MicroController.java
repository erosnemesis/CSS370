package MicroController;

import Vehicle.*;

public class MicroController {

	private Accelerometer accel;
	private GPS gps;
	private Gyroscope gyro;
	private RfTransmitter rf;
	private Vehicle vehicle;

	public MicroController(String vehicleType, String make, String model){
		this.accel = new Accelerometer();
		this.gps = new GPS();
		this.gyro = new Gyroscope();
		this.rf = new RfTransmitter();

		this.vehicle = VehicleFactory.getVehicle(vehicleType, this.rf.getId(), make, model);
	}

	public Accelerometer getAccelerometerData(){
		return this.accel;
	}

	public GPS getGPSData(){
		return this.gps;
	}

	public Gyroscope getGyroscopeData(){
		return this.gyro;
	}

	public RfTransmitter getRfData(){
		return this.rf;
	}

	public Vehicle getVehicleData(){
		return this.vehicle;
	}
	
	@Override
	public String toString() {
		String microControllerString = "microcontroller with a speed of " + accel.getSpeed() 
			+ ", GPS " + gps.getCoordinates() + ", gyro " + gyro + ", rf ID " + rf.getId();
		microControllerString += "\nAssociated with a " + vehicle;
		return microControllerString;
	}
}
