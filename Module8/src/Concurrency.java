class Concurrency extends Thread {

    public static int testable = 10;
    private int[] arr;
    private int low, high, partialResult;

    public Concurrency(int[] arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = Math.min(high, arr.length);
    }

    public int getSum() {
        return partialResult;
    }

    public void run() {
        partialResult = sum(arr, low, high);
    }

    public static int sum(int[] arr) {
        return sum(arr, 0, arr.length);
    }

    public static int sum(int[] arr, int low, int high) {
        int total = 0;
        for (int i = low; i < high; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int parallelSum(int[] arr) {
        return parallelSum(arr, Runtime.getRuntime().availableProcessors());
    }

    public static int parallelSum(int[] arr, int threads) {
        int size = (int) Math.ceil(arr.length * 1.0 / threads);
        Concurrency[] sums = new Concurrency[threads];

        for (int i = 0; i < threads; i++) {
            sums[i] = new Concurrency(arr, i * size, (i + 1) * size);
            sums[i].start();
        }

        try {
            for (Concurrency sum : sums) {
                sum.join();
            }

        } catch (InterruptedException e) { }
        int totalResult = 0;
        for (Concurrency sum : sums) {
            totalResult += sum.getSum();
        }
        return totalResult;
    }

}

