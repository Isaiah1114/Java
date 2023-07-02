import java.util.Random;

public class Main {

    public static void main(String[] args) {
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
