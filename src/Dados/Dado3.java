package Dados;

public class Dado3 implements Comparable{
    private int chave;
    private int[] valor;

    public Dado3(int chave, int[] valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int[] getValor() {
        return valor;
    }

    public void setValor(int[] valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Object B) {                            //Se for A<B, sendo A o dado que chamou o método
        Dado3 dado = (Dado3) B;
        if(this.getChave()<dado.getChave())                     //Retorna -1 para A<B
            return -1;
        else if (this.getChave()== dado.getChave())       //Retorna 0 para A==B
            return 0;
        else
            return 1;                                           //Retorna 1 para A>B
    }
}
