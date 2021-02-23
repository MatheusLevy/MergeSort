// Classe Executavel do Programa

public class Main {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]= 3;
        arr[1]= 2;
        arr[2]= 9;
        arr[3]= 12;
        arr[4]= 78;
        MergeSort.mergesort(arr,0,5);
        for (int i=0;i<arr.length;i++)
            System.out.println("Vetor["+i+"]= " +arr[i]);


    }

}
