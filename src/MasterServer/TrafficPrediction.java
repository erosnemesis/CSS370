package MasterServer;

import MicroController.MicroController;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class TrafficPrediction {

    // accumulatedData is all data collected in the last 3 weeks in order to safetly predict a pattern
    private ArrayList<MicroController> acculumatedData;
    private String prediction;

    // possible Machine Learning approach
    // input data( speed, idle time, num of Cars, )
    // fraction_Wrong - calculate % error
    // loss
    // find_gradient
    // gradient_descent_step
    // gradient_descent

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