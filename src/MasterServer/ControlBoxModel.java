package MasterServer;
import MasterServer.ControlBoxEvent;

/**
 * MasterServer counterpart to ControlBox that mimics the behavior of a 
 * ControlBox
 * 
 * @author default Robert, Trent, Jeffrey, Megan
 *
 */
public class ControlBoxModel {

    private DigitalModel digitalModel;
    private ControlBoxEvent boxEvent;
    
    /**
     * Constructor instantiates an empty DigitalModel and a specific ControlBoxEvent
     * 
     * @param boxEvent ControlBoxEvent associated with the model
     */
    public ControlBoxModel(ControlBoxEvent boxEvent){
        this.boxEvent = boxEvent;
        this.digitalModel = new DigitalModel();
    }
    
    /**
     * Returns the DigitalModel
     * 
     * @return DigitalModel
     */
    public DigitalModel getDigitalModel(){
        return this.digitalModel;
    }

    /**
     * Returns the ControlBoxEvent
     * 
     * @return ControlBoxEvent
     */
    public ControlBoxEvent getBoxEvent(){
        return this.boxEvent;
    }

}
