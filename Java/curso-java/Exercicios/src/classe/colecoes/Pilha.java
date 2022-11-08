package classe.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        


        Deque<String> livros = new ArrayDeque<>();  //uso de LIFO (last in, First out)

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.remove());
        System.out.println(livros.pop());

// os metodos são os mesmos usados nas listas ou filas

    }
    
}
