package MasterServer;

import StopLight.ControlBox;

/**
 * Keeps track of all previous traffic light events for data storage
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class MasterServer {

	private static MasterServer masterServer = new MasterServer();

	/**
	 * Singleton pattern
	 */
	private MasterServer(){

	}

	/**
	 * Reference to the one master server
	 * @return master server reference
	 */
	public static MasterServer getInstance(){
		return masterServer;
	}

	/**
	 * Retrieve certain information from a control box stored on the server
	 * 
	 * @param controlBox to get info on
	 */
	public void collectControlBoxData(ControlBox controlBox){
		controlBox.getDigitalModel(); // pass this into a controlboxevent
		// pass controlboxevents to the TrafficPrediction
		controlBox.getIntersection(); // pass this into a controlboxevent
	}
}
