// Classe Executavel do Programa

import MergeSort.MergeSort;
import Dados.*;

import java.lang.Comparable;

public class Main {
    public static <T extends Comparable<T>> void main(String[] args){

       /*
        Dado1 d1 = new Dado1("AAA",123);
        Dado1 d2 = new Dado1("BBB",123);
        Dado1 d3 = new Dado1("AAAA",123);
        Dado1 d4 = new Dado1("CC",123);

        Dado1[] arr = new Dado1[4];
        arr[0]=d2;          // BBB AAA CCC AAAA
        arr[1]=d1;
        arr[2]=d4;
        arr[3]=d3;

       Dado2 d1 = new Dado2(12.3,"a");
       Dado2 d2 = new Dado2(6.0,"a");
       Dado2 d3 = new Dado2(8.2,"a");
       Dado2 d4 = new Dado2(9.7,"a");

       Dado2[] arr =  new Dado2[4];
       arr[0] = d1;             //  12.3  6.0  9.7 8.2
       arr[1] = d2;
       arr[2] = d4;
       arr[3] = d3;
       */
       int[] a = new int[3];
       Dado3 d1 = new Dado3(20,a);
       Dado3 d2 = new Dado3(99,a);
       Dado3 d3 = new Dado3(12,a);
       Dado3 d4 = new Dado3(55,a);

       Dado3[] arr = new Dado3[4];

        arr[0] = d1;             //20 99 55 12
        arr[1] = d2;
        arr[2] = d4;
        arr[3] = d3;

       MergeSort.mergesort(arr,0,arr.length);

         for (int i=0;i<arr.length;i++)
            System.out.println("Vetor["+i+"]= " +arr[i].getChave());

    }

}
