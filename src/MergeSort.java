import java.util.ArrayList;

public class MergeSort {

    public static void mergesort(int[] vetor, int inicio, int fim){

        int meio;
        if(inicio<fim){
            meio = (int) Math.floor((inicio+fim)/2); // Calcula onde fica o meio do vetor
            mergesort(vetor,inicio,meio);            // Chamada recursiva do inicio do vetor até a metade
            mergesort(vetor,meio+1,fim);      // Chamada recursiva da 2ª parte do vetor (meio+1) até o fim
            //merge(vetor,inicio,meio,fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim){

        int cont1 = inicio; // Contador da 1ª parte
        int cont2= meio+1; // Contador da 2ª parte
        int tamanho = fim-inicio+1; // tamanho do vetor enviado para função.

        //fim1 e fim2 correspondem a 2 possibilidades de saida do if
        //Sendo fim1 quando o contador cont1 passar do meio do vetor. Pois o primeiro vetor corresponde somente a primeira parte do vetor.
        //E fim2 quando o contador cont2 passar do fim do vetor. Pois o segundo vetor corresponde  somente a segunda parte do vetor.
        boolean fim1=false, fim2=false;

        //O tamanho de vetorP1 é meio, pois ele é vai só até o meio do vetor
        //O tamanho do vetorP2 é fim - cont2, pois fim-cont2 corresponde ao tamanho do meio+1 até o fim do vetor.
        int[] vetorP1 = new int[meio]; // Vetor correspondente a primeira parte do vetor: do inicio até a meio;
        int[] vetorP2 = new int[fim-cont2]; // Vetor correspondente a segunda parte do vetor: do meio+1 até o fim;

        /* Vamos dividir o vetor recebido em 2 vetores, os vetores vetorP1 e o vetor, a primeira parte do vetor recebido
           que corresponde aos valores do inicio até o meio serão armazenados em vetorP1 e a segunda parte que corresponde
           do meio+1 até o fim serão armazenados em vetorP2.
         */
        for(int i=0;i<cont1;i++)
            vetorP1[i] = vetor[i];
        for(int i=cont2;i<fim;i++)
            vetorP2[i] = vetor[i];

        int auxP2=0; //Contador no vetorP2 que é o sub arrey de que começou em cont2 e termina em fim.
        for(int i=0; i<tamanho;i++){
            if(!fim1 && !fim2){ // Se nenhum contador tiver passado do seu limite
                if(vetorP1[cont1]<vetorP2[auxP2]) {             //Compara as duas posições dos dois vetores. O merge deve colocar
                    vetor[i] = vetorP1[cont1];                  //no vetor o menor e depois o maior. Ele compara as posições dos subvetores
                    cont1++;                                    //vetorP1 e vetorP2 para ordenar os dois subarrays em um unico array que
                }else{                                          // é o array recebido na função
                    vetor[i]=vetorP2[auxP2];
                    auxP2++;
                }

                /*Precisamos verificar sempre se nenhum dos nosso 2 contadores passaram do limeite. Ou seja, se cont1
                  passou de meio, pois meio+1 já não está definido no tamanho do vetorP1 que só vai até meio. E auxP2 começa
                  em 0 e vai até
                */
                if(cont1>meio)
                    fim1 = true;
                if(auxP2>fim-cont2) //fim-cont2 é o tamanho maximo do contador aauxP2, pois determina a quantidade de elementos
                    fim2 = true;    // que existem do meio+1 até o fim do vetor.
            }else{ // caso ele não tenha entrado no if vamos verificar se foi por causa da condição fim1 ou fim2.
                if(!fim1){

                }
            }
        }
        //Vetores Temporarios


    }
}

