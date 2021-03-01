package InsertSort;

public class InsertSort {

    public static  <T extends Comparable<T>> void insertSort(T[] vetor, int inicio,int fim){
        T chave;  //A chave que será comparada com os elementos anteriores do vetor
        int j;
        int tamanho = fim-inicio;
        for(int i=1;i<tamanho;i++){
            chave = vetor[i]; //Começando na segunda posição do vetor a chave
                                //vetor[j]>chave
            for(j=i-1;(j>=0) && (vetor[j].compareTo(chave)==1);j--){          //Percorrendo da posição antrior a chave até o inicio do vetor
                vetor[j+1]=vetor[j];                                          // ou até achar um elemento maior pra ser trocado.
            }                                                                 //Enquanto as posições anteriores forem maiores vai copiando por cima da posição da chave
            vetor[j+1]= chave;                                                // Quando sair do loop coloca a chave no lugar e ai vai organizar
        }
    }
}
