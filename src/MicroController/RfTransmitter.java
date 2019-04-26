package MicroController;

import Helpers.RandomGenerator;

/**
 * Stores and transmits rf information
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class RfTransmitter {

	private int id;
	
	/**
	 * Generates an rf id
	 */
	public RfTransmitter(){
		this.id = RandomGenerator.getInstance().getRandomInt();
	}

	@Override
	/**
	 * Generates a string
	 * 
	 * @return string
	 */
	public String toString() {
		return "Some RF Transmitter Data";
	}

	/**
	 * Get id from transmitter
	 * 
	 * @return registered id
	 */
	public int getId(){
		return this.id;
	}
}
