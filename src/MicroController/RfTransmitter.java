package MicroController;

import Helpers.RandomGenerator;

public class RfTransmitter {

	private int id;

	public RfTransmitter(){
		this.id = RandomGenerator.getInstance().getRandomInt();
	}

	@Override
	public String toString() {
		return "Some RF Transmitter Data";
	}

	public int getId(){
		return this.id;
	}
}
