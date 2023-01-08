package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        

        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Clara", 7);
        Aluno a3 = new Aluno("Eva", 8);
        Aluno a4 = new Aluno("Lina", 6);
        
        List<Aluno> classe = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = a -> a.nota;
        BinaryOperator<Double> soma = (a, b) -> a + b;



        classe.stream().filter(aprovados).map(getNota).reduce(soma).ifPresent(System.out::println);
        
    
    
    
    
    
    
    
    }
}
