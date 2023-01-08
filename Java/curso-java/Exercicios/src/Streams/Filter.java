package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    
    public static void main(String[] args) {
        

        Aluno a1 = new Aluno("Ana", 8.5);
        Aluno a2 = new Aluno("Bia", 5.5);
        Aluno a3 = new Aluno("Theo", 8.4);
        Aluno a4 = new Aluno("Maria", 6.5);
        Aluno a5 = new Aluno("João", 7.5);
        Aluno a6 = new Aluno("Kiko", 8.2);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> msg = a -> "PARABENS " + a.nome + "! , você PASSOU";


        alunos.stream().filter(aprovado).map(msg).forEach(System.out::println);


        alunos.stream()
            .filter(a -> a.nota >= 7)
            .map(a -> "PARABENS " + a.nome + "! , você PASSOU")
            .forEach(System.out::println);
    }
}
