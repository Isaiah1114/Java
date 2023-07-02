import org.junit.jupiter.api.Assertions;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrencyTest {
    public static void main(String[] args) {
        assertEquals(Concurrency.testable, 10);

        Random random = new Random();
        int[] myArray = new int[200000000];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
        }

        long run = System.currentTimeMillis();
        System.out.println(Concurrency.sum(myArray));
        System.out.println("Single: " + (System.currentTimeMillis() - run));
        run = System.currentTimeMillis();
        System.out.println(Concurrency.parallelSum(myArray));
        System.out.println("Parallel: " + (System.currentTimeMillis() - run));
    }

}