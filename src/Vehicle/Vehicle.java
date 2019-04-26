package Vehicle;

/**
 * Vehicle interface to collect functionality of all other vehicles
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public interface Vehicle {
	
	int getId();
	String getModel();
	String getMake();
	int getPriority();
	String toString();
}