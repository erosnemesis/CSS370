package MasterServer;

public class DigitalModel {
	// mimics the other DigitalModel
    private ArrayList<ControlBoxEvent> controlBoxEventArrayList;

    public DigitalModel(){
    }

    public void addEvent(ControlBoxEvent controlBoxEvent){
        controlBoxEventArrayList.add(controlBoxEvent);
    }

    public void removeEvent(ControlBoxEvent controlBoxEvent){controlBoxEventArrayList.remove(controlBoxEvent);
    }

    public void sortQueue(){
        controlBoxEventArrayList.sort(null);
        System.out.println("Digital Model has been sorted by time...");
    }

    /*

    All events sent to MasterServer will be handled by the DigitalModel
    Will contain list of Control Box Events

     */

}
