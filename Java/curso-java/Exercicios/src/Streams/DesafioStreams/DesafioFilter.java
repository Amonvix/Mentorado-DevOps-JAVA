package Streams.DesafioStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Computer", 3700.99, 0.1, false);
        Produto p2 = new Produto("Monitor", 1350.80, 0.3, true);
        Produto p3 = new Produto("Teclado", 185.99, 0.15, false);
        Produto p4 = new Produto("Mouse", 70.99, 0.1, false);
        Produto p5 = new Produto("GPU", 5990, 0.3, true);
        Produto p6 = new Produto("Desktop", 4700.99, 0.3, true);
        Produto p7 = new Produto("Switch", 8700.99, 0.01, false);

        List<Produto> estoque = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        Predicate<Produto> caro = p -> p.desconto >=0.3;
        Predicate<Produto> promoTeste = p -> p.frete == true;
        Function<Produto, String> fim = p-> "O item " + p.nome + " está em PROMOÇÃO, pelo valor de R$" + Produto.calculo(p)+"\n";
        

        estoque.stream().filter(caro).filter(promoTeste).map(fim).forEach(System.out::print);



    }

}
