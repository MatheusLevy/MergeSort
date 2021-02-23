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

        int tamanho = fim-inicio+1;

        boolean fim1=false, fim2=false;
        int cont1 = inicio; // Contador da 1ª parte
        int cont2= meio+1; // Contador da 2ª parte
        //fim1 e fim2 correspondem a 2 possibilidades de saida do if
        //Sendo fim1 quando o contador cont1 passar do meio do vetor. Pois o primeiro vetor corresponde somente a primeira parte do vetor.
        //E fim2 quando o contador cont2 passar do fim do vetor. Pois o segundo vetor corresponde  somente a segunda parte do vetor.


        int[] VetorP1; // Vetor correspondente a primeira parte do vetor: do inicio até a meio;
        int[] VetorP2; // Vetor correspondente a segunda parte do vetor: do meio+1 até o fim;




        for(int i=0; i<tamanho;i++){
            if(!fim1 && !fim2){ // Se nenhum contador tiver passado do seu limite

            }
        }
        //Vetores Temporarios


    }
}

