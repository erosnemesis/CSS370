package MasterServer;
import java.util.ArrayList;
import java.util.List;
import MasterServer.ControlBoxEvent;

/**
 * Keeps track of all events that happen for a particular ControlBoxModel
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class DigitalModel {
    private ArrayList<ControlBoxEvent> controlBoxEvents;
    
    /**
     * Constructs an empty DigitalModel
     */
    public DigitalModel(){
        controlBoxEvents = new ArrayList<ControlBoxEvent>();
    }

    /**
     * Adds an event to be stored on the master server
     * 
     * @param event to be stored
     */
    public void addEvent(ControlBoxEvent event){
        System.out.println("Adding " + event);
        controlBoxEvents.add(event);
    }

    /**
     * Removes an event from the master server for maintenance
     * 
     * @param event bad event to remove
     */
    public void removeEvent(ControlBoxEvent event){
        System.out.println("Removing event from database: " + event);
        controlBoxEvents.remove(event);
    }

    /**
     * Organizes all the events in queue
     */
    public void sortQueue(){
        controlBoxEvents.sort(null);
        System.out.println("Digital Model has been sorted...");
    }

    /**
     * Get the list of all control box events
     * 
     * @return control box events associated with this model
     */
    public List<ControlBoxEvent> getControlBoxEvents() {
        return controlBoxEvents;
    }

}


