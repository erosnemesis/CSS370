package MasterServer;
import MasterServer.ControlBoxEvent;

public class ControlBoxModel {
	// mimics a controlBox
    private MasterServer.DigitalModel digitalModel;
    private ControlBoxEvent boxEvent;

    public ControlBoxModel(ControlBoxEvent boxEvent){
        this.boxEvent = boxEvent;
        this.digitalModel = new MasterServer.DigitalModel();
    }

    public MasterServer.DigitalModel getDigitalModel(){
        return this.digitalModel;
    }

    public ControlBoxEvent getBoxEvent(){
        return this.boxEvent;
    }

}
