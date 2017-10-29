
import java.util.Random;

/**
 * Created by Daniel on 10/25/17.
 */

public class RandomNumGeneration {
    public static void main(String[] args){
        Random generator = new Random();
        int num1;
        float num2;
        num1 = generator.nextInt();//Random Integer Value with no bounds
        System.out.println("A random Integer: " + num1);

        num1 = generator.nextInt(10); //Random Integer Value between 0 and 10 excluding 10
        System.out.println("From 0 - 9: " + num1);

        num1 = generator.nextInt(10) +1;//Random Integer Value between 1 and 10
        System.out.println("From 1-10: " + num1);

        num1 = generator.nextInt(15) +20; //Random Integer value between 20 and 34[20 + 14]
        System.out.println("From 20-34: " + num1);

        num1 = generator.nextInt(20) -10; //Random Integer value between -10 and 9;
        System.out.println("From -10-9: " + num1);

        num2 = generator.nextFloat(); //Random number between 0 and 1
        System.out.println("Random float between 0-1: " + num2);

        num2 = generator.nextFloat() * 6; //0.0 to 5.99999
        System.out.println("Second float between 0-1: " + num2);
        num1 = (int)num2 + 1; //Take whole number(integer) and add 1 to it.
        System.out.println("From 1 to 6: " + num1);

    }
}
