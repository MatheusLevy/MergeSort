// Classe Executavel do Programa

public class Main {
    public static void main(String[] args){
        int[] arr = {3,5,4,1,9,6,7,2,10};
        MergeSort.mergesort(arr,0,arr.length);
        for (int i=0;i<arr.length;i++)
            System.out.println("Vetor["+i+"]= " +arr[i]);

    }

}
