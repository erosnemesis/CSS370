package Helpers;
import java.util.Date;
import java.util.Random;

public class RandomGenerator {

	private static Random rand = new Random(new Date().getTime());
	private static RandomGenerator randomGenerator = new RandomGenerator();

	private RandomGenerator(){}

	public static RandomGenerator getInstance(){
		return randomGenerator;
	}

	public int getRandomInt(){
		return rand.nextInt(10000);
	}

	public double getRandomSpeed() {
		return rand.nextInt(120) + rand.nextDouble();
	}
}
