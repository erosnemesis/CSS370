package MasterServer;
import java.util.ArrayList;
import java.util.List;
import MicroController.MicroController;
import MasterServer.ControlBoxModel;

/**
 * Class to store traffic light events on the master server in order to process
 * and store historical data
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class ControlBoxEvent {

    private int date;
    private double time;
    private double longitude;
    private double latitude;
    private ArrayList<MicroController> controlBoxEvents;
    
    /**
     * Generates a ControlBoxEvent
     * 
     * @param date when event happened
     * @param time more precise measure of when it happened
     * @param longitude coordinates for event
     * @param latitude coordinates for event
     */
    public ControlBoxEvent(int date, double time, double longitude, double latitude){
    	this.date = date;
    	this.time = time;
    	this.longitude = longitude;
    	this.latitude = latitude;
    }
    
    /**
     * Add a MicroController to the event list
     * 
     * @param controlBoxEvent MicroController that happened
     */
    public void addEvent(MicroController controlBoxEvent) {
    	controlBoxEvents.add(controlBoxEvent); 
    }

    /**
     * Removes a MicroController
     * 
     * @param controlBoxEvent MicroContoller to be removed
     */
    public void removeEvent(MicroController controlBoxEvent) {
    	controlBoxEvents.remove(controlBoxEvent); 
    }


    /*

    All events sent to MasterServer will be handled by the ControlBoxEvent
    Will contain list of data about the event

     */

}

