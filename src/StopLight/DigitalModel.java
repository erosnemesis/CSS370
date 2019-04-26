package StopLight;
import java.util.ArrayList;
import java.util.List;
import MicroController.MicroController;

public class DigitalModel {
    private ArrayList<MicroController> intersectionQueue;

    public DigitalModel(){
    	intersectionQueue = new ArrayList<MicroController>();
    }

    public void addMicroController(MicroController microController){
        System.out.println("Adding " + microController);
    	intersectionQueue.add(microController);
    }

    public void removeMicroController(MicroController microController){
    	System.out.println("Removing microcontroller with id:" + microController.getRfData().getId());
    	intersectionQueue.remove(microController);
    }

    public void sortQueue(){
        intersectionQueue.sort(null);
        System.out.println("Digital Model has been sorted...");
    }

    /*

    All vehicles in range of the intersection
    Will contain list of micro controllers in an arbitrary area (circle on map)

     */
    
    public List<MicroController> getVehicleQueue() {
    	return intersectionQueue;
    }

}
