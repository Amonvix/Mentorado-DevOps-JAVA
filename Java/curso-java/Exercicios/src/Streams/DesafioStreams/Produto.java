package Streams.DesafioStreams;

public class Produto {

    final String nome;
    final double preco;
    double desconto;
    boolean frete;
    public Produto(String nome, double preco, double desconto, boolean frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    static double calculo(Produto p) {
        return p.preco - (p.preco * p.desconto);
    }

    
    
}
