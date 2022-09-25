
import java.util.concurrent.RecursiveAction;

public class QuicksortForkJoinHoare extends RecursiveAction {
    private int[] array;
    private int inicio;
    private int fim;
    public QuicksortForkJoinHoare(int[] array, int inicio, int fim){
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }

    public QuicksortForkJoinHoare(int[] array){
        this(array, 0, array.length - 1);
    }

    @Override
    protected void compute() {
        if(inicio < fim){
            int q = partition(array, inicio, fim);

            invokeAll(new QuicksortForkJoinHoare(array, inicio, q - 1),
                    new QuicksortForkJoinHoare(array, q + 1, fim));
        }
    }

    private static int partition(int[] A, int inicio, int fim){
        int pivo = A[inicio];
        int i = inicio + 1;
        int j = fim;

        while(i <= j){

            while(i <= j && A[i] <= pivo){
                i = i + 1;
            }

            while(i <= j && A[j] > pivo){
                j = j - 1;
            }

            if(i < j){
                swap(A, i, j);
            }
        }

        swap(A, inicio, j);
        return j;
    }
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}