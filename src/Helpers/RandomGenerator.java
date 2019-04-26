package Helpers;
import java.util.Date;
import java.util.Random;

/**
 * Helper class to generate random doubles and ints
 * Utilizes a singleton pattern
 * 
 * @author Robert, Trent, Jeffrey, Megan
 *
 */
public class RandomGenerator {

	private static Random rand = new Random(new Date().getTime());
	private static RandomGenerator randomGenerator = new RandomGenerator();
	
	/**
	 * Private constructor 
	 */
	private RandomGenerator(){}
	
	/**
	 * Returns a reference to the RandomGenerator Object
	 * 
	 * @return single instance of RandomGenerator
	 */
	public static RandomGenerator getInstance(){
		return randomGenerator;
	}
	
	/**
	 * Get a random int
	 * 
	 * @return random int
	 */
	public int getRandomInt(){
		return rand.nextInt(10000);
	}
	
	/**
	 * Get a random double used for simulating speed of vehicles
	 * 
	 * @return random double
	 */
	public double getRandomSpeed() {
		return rand.nextInt(120) + rand.nextDouble();
	}
}
