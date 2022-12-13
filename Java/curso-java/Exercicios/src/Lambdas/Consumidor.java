package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Notebook", 350, 0.15);
        // imprimir.accept(p1);

        Produto p2 = new Produto("caneta", 3.50, 0.15);
        Produto p3 = new Produto("livro", 35.0, 0.15);
        Produto p4 = new Produto("caderno", 13.50, 0.15);
        Produto p5 = new Produto("lapis", 0.50, 0.15);

        List<Produto> lista = Arrays.asList(p1,p2,p3,p4,p5);

        lista.forEach(imprimir);
        lista.forEach(p -> System.out.println(p.preco));
        lista.forEach(System.out::println);





    }
}
