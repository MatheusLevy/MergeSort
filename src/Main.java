// Classe Executavel do Programa

import InsertSort.InsertSort;
import MergeSort.MergeSort;
import Dados.*;
import java.lang.Comparable;
import MergeSort.MergeSortPadrão;
import MergeSort.MergeInsertSort;
import MergeSort.MergeSortTestaOrdem;
import Leitura.Leitor;

import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static <T extends Comparable<T>> void main(String[] args) {
    /*
        //----DADO1----------------------------
        Dado1[] arr1_30000 = Leitor.leitor1(30000);

        System.out.println("Ordem Inicial Vetor com 30000 elementos\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr1_30000[i].getChave());
        System.out.println("...\n\n");

        MergeSort.sort(arr1_30000);
        System.out.println("Após Chamado do MergeSort otimizado\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr1_30000[i].getChave());
        System.out.println("...");


        //----DADO2----------------------------
        Dado2[] arr2_30000 = Leitor.leitor2(30000);

        System.out.println("Ordem Inicial Vetor com 30000 elementos\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr2_30000[i].getChave());
        System.out.println("...\n\n");

        MergeSort.sort(arr2_30000);
        System.out.println("Após Chamado do MergeSort otimizado\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr2_30000[i].getChave());
        System.out.println("...");
        */
 /*
        //----DADO3----------------------------
        Dado3[] arr3_30000 = Leitor.leitor3(30000);

        System.out.println("Ordem Inicial Vetor com 30000 elementos\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr3_30000[i].getChave());
        System.out.println("...\n\n");
        */
          /*
        System.out.println("Após Chamado do MergeSort otimizado\n\n");
        for (int i = 0; i < 10; i++)
            System.out.println("Vetor[" + i + "]= " + arr3_30000[i].getChave());
        System.out.println("...");
        */
          //--TESTES DE TEMPO

        System.out.println("10:");
        Dado1[] arr10_ = Leitor.leitor1(10);
        long start = System.currentTimeMillis();
        Arrays.sort(arr10_);
        long elapsed = System.currentTimeMillis() -start;
        System.out.println(elapsed+"ms");
        System.out.println("\n");

        System.out.println("100:");
        Dado1[] arr100_ = Leitor.leitor1(100);
        start = System.currentTimeMillis();
        Arrays.sort(arr100_);
        elapsed = System.currentTimeMillis() -start;
        System.out.println(elapsed+"ms");

        System.out.println("1000:");
        Dado1[] arr1000_ = Leitor.leitor1(1000);
        start = System.currentTimeMillis();
        Arrays.sort(arr1000_);
        elapsed = System.currentTimeMillis() -start;
        System.out.println(elapsed+"ms");

        System.out.println("10000:");
        Dado1[] arr10000_ = Leitor.leitor1(10000);
        start = System.currentTimeMillis();
        Arrays.sort(arr10000_);
        elapsed = System.currentTimeMillis() -start;
        System.out.println(elapsed+"ms");

        System.out.println("30000:");
        Dado1[] arr30000_ = Leitor.leitor1(30000);
        start = System.currentTimeMillis();
        Arrays.sort(arr30000_);
        elapsed = System.currentTimeMillis() -start;
        System.out.println(elapsed+"ms");


    }



}
