package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Gui", "Ana", "Tin", "Luca");

        System.out.println();
        System.out.println("Usando o Foreach...");
        
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println();
        
        System.out.println("\nUsando o Iterador");
        Iterator<String> ite = aprovados.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        
        System.out.println("\nUsando o Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
        




    }
    
}
