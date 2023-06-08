public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int FibCount = 40;

        for(int i = 0; i <= FibCount; i++){
            int n = i;

            System.out.printf("%d Fibonacci iteration: %d Time: %d ms\n ", i , fibIteration(n) ,System.currentTimeMillis() - start );


        }

        System.out.println("\n------------------------------------------\n");


        start = System.currentTimeMillis();
        for(int i = 0; i <= FibCount; i++) {
            int n = i;
            System.out.printf("%d Fibonacci recursion: %d Time: %d ms\n",i, fibRecursion(n), System.currentTimeMillis() - start);



        }

    }

    //Iteration
    static int fibIteration(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}