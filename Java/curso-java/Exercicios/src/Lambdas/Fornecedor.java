package Lambdas;

import java.util.Arrays;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        
        Supplier<Object> umaLista = () -> Arrays.asList("Bia", "Lia", "Dre", "Gui");

        System.out.println(umaLista.get());


    }
}
