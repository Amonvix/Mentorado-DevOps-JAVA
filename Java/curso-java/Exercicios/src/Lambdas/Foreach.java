package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");


        System.out.println("forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Lambda #1");

        aprovados.forEach((pessoa) -> {System.out.println(pessoa + "!!!");});

        System.out.println("\nMethod Reference #1");
        aprovados.forEach(System.out::println);

        System.out.println("\nUsando Lambda #2");

        aprovados.forEach((pessoa) -> meuImprimir(pessoa));

        System.out.println("\nMethod Reference #2");
        aprovados.forEach(Foreach::meuImprimir);

    }
    static void meuImprimir(String nome){
        System.out.println("Oi! meu nome é " + nome); 
    }
}
