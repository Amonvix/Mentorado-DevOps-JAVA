package classe.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // add e offer são para adicionar itens na fila,
        // a diferença de comportamento ocorre quando a fila esta cheia.

        fila.add("Ana");        //retorna false
        fila.offer("Tulio");    //lança uma exceção
        fila.add("José");
        fila.offer("Maria");
        fila.add("Mario");
        
        // peek e element são para obter o proximo iten da fila (sem remover)
        // a diferença de comportamento ocorre quando a fila esta vazia.


        System.out.println(fila.peek());            // retorna null se a fila estiver vazia
        System.out.println(fila.element());         // retorna uma exceção


        // fila.size();         //comando para ter a quantidade de posições de uma lista
        // fila.clear();        //comando usado para remover todos os itens da lista
        // fila.isEmpty();      //comando para verificar se a lista esta vazia
        //fila.contains(args);  //verifica se determinado valor existe na fila

        // poll e remove são para obter o proximo iten da fila (removendo)

        System.out.println(fila.poll());        //usado para exibir e remover o proximo item da fila
        System.out.println(fila.poll());        //quando a fila esta vazia, retorna null
        System.out.println(fila.remove());      //remove o proximo item da lista, exceção caso vazio


    }    
}
