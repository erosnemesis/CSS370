package StopLight;

/**
 * Object to maintain and handle a queue of vehicles and a specific intersection
 * 
 * @author default
 *
 */
public class ControlBox {
	private DigitalModel digitalModel;
	private Intersection intersection;
	
	/**
	 * Generates a single control box
	 * 
	 * @param intersection existing intersection to use
	 */
	public ControlBox(Intersection intersection){
		this.intersection = intersection;
		this.digitalModel = new DigitalModel();
	}

	/**
	 * Get a reference for the vehicle queue
	 * 
	 * @return vehicle queue reference
	 */
	public DigitalModel getDigitalModel(){
		return this.digitalModel;
	}

	/**
	 * Get a reference for the intersection information
	 * 
	 * @return intersection
	 */
	public Intersection getIntersection(){
		return this.intersection;
	}
	
	/**
	 * Update the associated traffic light
	 */
	public void pushLightColors() {
		digitalModel.getVehicleQueue();
		System.out.println("Calculating optimal traffic light timings");
		intersection.setTrafficLights("some timings");
	}
}