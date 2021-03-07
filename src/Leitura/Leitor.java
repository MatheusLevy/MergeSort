package Leitura;

import Dados.Dado1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Leitor {

   public static  Dado1[] leitor1(int quantidade){

       File arquivo = new File("Tabela_String_Double.csv");
       Dado1[] arr = new Dado1[quantidade];

       try{
           Scanner leitor = new Scanner(arquivo);

           String linhas = new String();
           linhas = leitor.nextLine();

           for(int i=0;i<quantidade;i++){
               linhas = leitor.nextLine();
               String[] linha = linhas.split(",");
               arr[i] = gerarObjeto(linha);
           }
       }catch (FileNotFoundException e){
           System.out.println("not found");
       }
       return arr;
    }


    private static Dado1 gerarObjeto(String[] linha){
       Double valor = Double.parseDouble(linha[1]);
       String chave = linha[0].toUpperCase();
       return new Dado1(chave,valor);
    }

}
