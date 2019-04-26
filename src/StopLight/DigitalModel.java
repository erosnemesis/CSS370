package StopLight;
import java.util.ArrayList;
import java.util.List;
import MicroController.MicroController;

/**
 * Stores information on the current vehicles at the intersection
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class DigitalModel {
    private ArrayList<MicroController> intersectionQueue;

    /**
     * Constructor to create an empty vehicle queue
     */
    public DigitalModel(){
    	intersectionQueue = new ArrayList<MicroController>();
    }

    /**
     * Adds a microcontroller connected to a vehicle to the queue
     * 
     * @param microController to be added to the queue
     */
    public void addMicroController(MicroController microController){
        System.out.println("Adding " + microController);
    	intersectionQueue.add(microController);
    }

    /**
     * Removes a specific microcontroller from the queue
     * When a vehicle exits the intersection
     * 
     * @param microController to be removed
     */
    public void removeMicroController(MicroController microController){
    	System.out.println("Removing microcontroller with id:" + microController.getRfData().getId());
    	intersectionQueue.remove(microController);
    }
    
    /**
     * Sorts the current vehicles waiting in the queue
     */
    public void sortQueue(){
        intersectionQueue.sort(null);
        System.out.println("Digital Model has been sorted...");
    }

    /**
     * Get a reference to the queue of vehicles waiting
     * 
     * @return vehicle waiting queue
     */
    public List<MicroController> getVehicleQueue() {
    	return intersectionQueue;
    }

}
