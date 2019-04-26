package MasterServer;

public class ControlBoxModel {
	// mimics a controlBox
    private ControlBoxModel digitalModel;
    private ControlBoxEvent intersection;

    public ControlBoxModel(Intersection intersection){
        this.intersection = intersection;
        this.digitalModel = new DigitalModel();
    }

    public DigitalModel getDigitalModel(){
        return this.digitalModel;
    }

    public Intersection getIntersection(){
        return this.intersection;
    }
}
