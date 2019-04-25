package StopLight;
import java.util.ArrayList;
import MicroController.MicroController;

public class DigitalModel {
    private ArrayList<MicroController> intersectionQueue;

    public DigitalModel(){
    }

    public void addMicroController(MicroController microController){
        intersectionQueue.add(microController);
    }

    public void removeMicroController(MicroController microController){
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

}
