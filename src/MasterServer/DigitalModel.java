package MasterServer;
import java.util.ArrayList;
import java.util.List;
import MasterServer.ControlBoxEvent;

public class DigitalModel {
    private ArrayList<ControlBoxEvent> controlBoxEvents;

    public DigitalModel(){
        controlBoxEvents = new ArrayList<ControlBoxEvent>();
    }

    public void addEvent(ControlBoxEvent event){
        System.out.println("Adding " + event);
        controlBoxEvents.add(event);
    }

    public void removeEvent(ControlBoxEvent event){
        System.out.println("Removing event from database: " + event);
        controlBoxEvents.remove(event);
    }

    public void sortQueue(){
        controlBoxEvents.sort(null);
        System.out.println("Digital Model has been sorted...");
    }

    /*

    All events stored on Master Sever organized by location, time, & date

     */

    public List<ControlBoxEvent> getControlBoxEvents() {
        return controlBoxEvents;
    }

}


