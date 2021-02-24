package Dados;

public class Dado1 implements Comparable{
    private String chave;
    private double valor;

    public Dado1(String chave, double valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public int compareTo(Object B) {
        //Para compararmos os valor em String vamos usar o valor como sendo a ordem alfabetica
        //Assim A>B>C>D>E e assim por diante, sendo o maior elemento o A e o menor o Z.
        Dado1 dado = (Dado1) B;
        dado.getChave().toUpperCase();              //Trabalhando somente com maiusculas
        int tamanhoString1 = this.getChave().length();
        int tamanhoString2 = dado.getChave().length();


        int i=0;
        while(i<tamanhoString1 && i<tamanhoString2){
            if((int) this.getChave().charAt(i) < (int)((Dado1) B).getChave().charAt(i)){
                return -1;    //Retorna -1 se achou um caractere de A que menor que o caractere de B
            }else if((int) this.getChave().charAt(i) > (int)((Dado1) B).getChave().charAt(i)){
                return 0;     //Retorna 1 se achou um caractere de A que é maior que o caractere de B
            }
        }
    }
}
