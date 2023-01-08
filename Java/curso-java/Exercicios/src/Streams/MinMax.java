package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        

        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Clara", 7);
        Aluno a3 = new Aluno("Eva", 8);
        Aluno a4 = new Aluno("Lina", 9);
        
        List<Aluno> classe = Arrays.asList(a1,a2,a3,a4);

        Comparator<Aluno> melhorNota = (al1,al2) -> {
            if (al1.nota > al2.nota) return 1;
            if (al1.nota < al2.nota) return -1;
            return 0;
        };Comparator<Aluno> piorNota = (al1,al2) -> {
            if (al1.nota > al2.nota) return -1;
            if (al1.nota < al2.nota) return 1;
            return 0;
        };

        System.out.println(classe.stream().max(melhorNota).get());
        System.out.println(classe.stream().min(melhorNota).get());
        System.out.println(classe.stream().max(piorNota).get());


    }
}
