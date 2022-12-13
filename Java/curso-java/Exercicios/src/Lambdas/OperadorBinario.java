package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        
        BinaryOperator<Double> media = (n,n2) -> (n + n2)/2;
        System.out.println(media.apply(5.0, 8.0));

        BiFunction<Double, Double, String> resultado = (n1,n2) -> 
        { double result = ((n1+n2)/2); return result >= 7 ? "Aluno Aprovado" : "Se Lascou";};
        System.out.println(resultado.apply(5.0, 8.0));
        
        Function <Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(5.0, 8.0));
        


    }



}
