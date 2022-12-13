package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {


        // conceito de programação funcional
        
        Function <Integer, String > parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        Function <String , String > oResultadoE = valor -> "O valor é : "+valor;

        Function <String , String > empolgado = valor -> valor + "!!!";

        Function <String , String > duvida = valor -> valor + "???";

        String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);

        System.out.println();
        System.out.println(resultadoFinal1);
        System.out.println(resultadoFinal2);

    }
}
