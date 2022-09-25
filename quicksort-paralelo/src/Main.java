import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        int[] array = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};

        pool.invoke(new QuicksortForkJoinHoare(array));

        for (int i : array)
            System.out.println(i);
    }
}