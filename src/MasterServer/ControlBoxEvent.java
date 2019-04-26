package MasterServer;
import java.util.ArrayList;
import java.util.List;
import MicroController.MicroController;
import MasterServer.ControlBoxModel;

public class ControlBoxEvent {
	// had a DigitalModel
	// date time of the event
    private int date;
    private double time;
    private double longitude;
    private double latitude;
    private ArrayList<MicroController> controlBoxEvents;

    public ControlBoxEvent(){ }

    public void addEvent(ControlBoxEvent controlBoxEvent){ controlBoxEvents.add(date, time, longitude, latitude); }

    public void removeEvent(ControlBoxEvent controlBoxEvent){controlBoxEvents.remove(date, time, longitude, latitude); }


    /*

    All events sent to MasterServer will be handled by the ControlBoxEvent
    Will contain list of data about the event

     */

}

