package MasterServer;

public class TrafficPrediction {

    // accumulatedData is all data collected in the last 3 weeks in order to safetly predict a pattern
    private MicroController[][] acculumatedData;
    private String prediction;

    // add data through array to matrix
    public TrafficPrediction(MicroController[] newData){
        acculumatedData.add(newData);
        System.out.println("New Data Added!")
    }

    public String getPrediction() {
        return prediction;
    }
}