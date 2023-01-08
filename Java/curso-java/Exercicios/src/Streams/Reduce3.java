package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 10);
        Aluno a2 = new Aluno("Clara", 7);
        Aluno a3 = new Aluno("Eva", 8);
        Aluno a4 = new Aluno("Lina", 6);
        
        List<Aluno> classe = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia = (media,nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.juntar(m1, m2);


        Media media = 
        classe.parallelStream().filter(aprovados).map(getNota).reduce(new Media(),calcularMedia, combinarMedia);

        System.out.println("A média da classe é " + media.getValor());
        
    }
}
