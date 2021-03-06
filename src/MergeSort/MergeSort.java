package MergeSort;

import Dados.Dado1;
import InsertSort.InsertSort;

import javax.management.ObjectName;
import javax.sound.midi.SysexMessage;
import java.security.PrivilegedAction;
import java.util.ArrayList;

public class MergeSort {

    public static <T extends Comparable<T>> void sort(T[] vetor){
        T[] auxiliar = vetor.clone();
        mergesort(auxiliar,vetor,0,vetor.length);
    }

    public static <T extends Comparable<T>>  void mergesort(T[] vetor,T[] auxiliar, int inicio, int fim){
        int tamanho = fim - inicio;
        if(tamanho<=0){
            InsertSort.insertSort(auxiliar,inicio,fim);
        }else{
            int meio;
            if(inicio<fim-1){
                meio = (inicio+fim)/2;               // Calcula onde fica o meio do vetor
                if(auxiliar[meio-1].compareTo(auxiliar[meio])<=0){
                    mergesort(auxiliar,vetor,inicio,meio);            // Chamada recursiva do inicio do vetor até a metade
                    mergesort(auxiliar,vetor,meio,fim);               // Chamada recursiva da 2ª parte do vetor (meio+1) até o fim
                }

                merge(vetor,auxiliar,inicio,meio,fim);
            }
        }
    }

   private static <T extends Comparable<T>> void merge(T[] vetor, T[] auxiliar, int inicio,int meio, int fim){
       int cont1=inicio; //Contador do primeiro subvetor
       int cont2=meio;   //Contador do segundo subvetor

       for(int k=inicio;k<fim;k++){                 //Percorrendo do inicio ao fim do vetor
           if(cont1>meio-1){                        //Caso o o cont1 tenha chegado no fim do subvetor1, mas o cont2 não, colocamos os elementos do 2subvetor no vetor.
               auxiliar[k]= vetor[cont2++];
           }
           else if(cont2>fim-1){                   //Caso o cont2 tenha chegado ao fim do subvetor2, mas o cont2 não, colocamos os elementos do 1subvertor no vetor.
               auxiliar[k] = vetor[cont1++];
           }
           else if(vetor[cont2].compareTo(vetor[cont1])<=0){    //Compara o valor do subvetor1 com o subvetor2 para ordenar
               auxiliar[k] = vetor[cont2++];
           }else{
               auxiliar[k]= vetor[cont1++];
           }
       }
   }

}

