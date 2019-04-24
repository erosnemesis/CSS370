package MasterServer;

import StopLight.ControlBox;

public class MasterServer {

	private static MasterServer masterServer = new MasterServer();

	/*
	There can only be 1 Master Server
	 */
	private MasterServer(){

	}

	public static MasterServer getInstance(){
		return masterServer;
	}

	public void collectControlBoxData(ControlBox controlBox){
		controlBox.getDigitalModel(); // pass this into a controlboxevent
		// pass controlboxevents to the TrafficPrediction
		controlBox.getIntersection(); // pass this into a controlboxevent
	}
}
