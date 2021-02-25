package Dados;

public class Dado2 implements Comparable<Dado2>{
    private double chave;
    private String valor;

    public Dado2(double chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public double getChave() {
        return chave;
    }

    public void setChave(double chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Dado2 B) {                            //Se for A<B, sendo A o dado que chamou o método
        Dado2 dado =  B;
        if(this.getChave() < dado.getChave())                     //Retorna -1 para A<B
            return -1;
        else if (this.getChave()==B.getChave())       //Retorna 0 para A==B
            return 0;
        else
            return 1;                                           //Retorna 1 para A>B
    }


    }

