package classe.colecoes;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoComportado {

    public static void main(String[] args) {
        Set<String> ListaAprovados = new HashSet<>();    // armazena os valores aleattoriamente.
        // Set<String> ListaAprovados = new TreeSet<>();       // respeita a ordem de inserção na exibição

        ListaAprovados.add("Ana");
        ListaAprovados.add("João");
        ListaAprovados.add("Maria");
        ListaAprovados.add("Silvania");

        for (String candidato : ListaAprovados) {
            System.out.println(candidato);
        }

        
    }
    
}
