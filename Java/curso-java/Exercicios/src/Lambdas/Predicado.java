package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = prod -> prod.preco >= 750; 


        Produto produto = new Produto("notebook", 700.0, 0.15);
        System.out.println(isCaro.test(produto));





    }
    
}
