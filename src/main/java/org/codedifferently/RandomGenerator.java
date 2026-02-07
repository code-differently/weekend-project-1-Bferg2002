package org.codedifferently;
import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }

    public int generateItemPrice(){
        return random.nextInt(0,101);
    }

    public double taxRate(){
        return random.nextDouble(0.0, 8.25);
    }
}
