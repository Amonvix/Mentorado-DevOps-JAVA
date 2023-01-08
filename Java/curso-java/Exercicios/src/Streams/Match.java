package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Clara", 7);
        Aluno a3 = new Aluno("Eva", 8);
        Aluno a4 = new Aluno("Lina", 9);
        
        List<Aluno> classe = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        System.out.println(classe.stream().allMatch(aprovados));
        System.out.println(classe.stream().anyMatch(aprovados));
        System.out.println(classe.stream().noneMatch(reprovados));

    }
}
