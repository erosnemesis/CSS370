package MasterServer;

import MicroController.MicroController;
import java.util.ArrayList;

/**
 * Class for predicting future traffic flow
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class TrafficPrediction {

    // accumulatedData is all data collected in the last 3 weeks in order to safetly predict a pattern
    private ArrayList<MicroController> acculumatedData;
    private String prediction;

    // singleton traffic prediction algorithm
    private TrafficPrediction(){

    }

    private void calculatePrediction(ArrayList<MicroController> someData){

    }

    public void addData(MicroController microController){
        acculumatedData.add(microController);
        System.out.println("Successfully added data!");
    }

    public String getPrediction() {
        return prediction;
    }
}