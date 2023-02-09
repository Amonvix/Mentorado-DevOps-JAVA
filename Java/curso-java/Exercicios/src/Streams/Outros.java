package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        

        Aluno a1 = new Aluno("Ana", 6.0);
        Aluno a2 = new Aluno("Clara", 7);
        Aluno a3 = new Aluno("Eva", 8);
        Aluno a4 = new Aluno("Lina", 9);
        Aluno a5 = new Aluno("Ana", 10.0);
        Aluno a6 = new Aluno("Pedro", 9);
        Aluno a7 = new Aluno("Eva", 8);
        Aluno a8 = new Aluno("Maria", 9);
        
        List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);

        System.out.println("Distinct...");

        classe.stream().distinct().forEach(System.out::println);
        
        System.out.println("\nSkip/Limit");
        classe.stream().distinct()
        .skip(2)
        .limit(2).forEach(System.out::println);        
        
        System.out.println("\nTakeWile");
        classe.stream().distinct().skip(3).takeWhile(a -> a.nota >= 9).forEach(System.out::println);

    }
    
}
