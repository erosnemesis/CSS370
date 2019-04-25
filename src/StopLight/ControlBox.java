package StopLight;

public class ControlBox {
	private DigitalModel digitalModel;
	private Intersection intersection;

	public ControlBox(Intersection intersection){
		this.intersection = intersection;
	}

	public DigitalModel getDigitalModel(){
		return this.digitalModel;
	}

	public Intersection getIntersection(){
		return this.intersection;
	}


}