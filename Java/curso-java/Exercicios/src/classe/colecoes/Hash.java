package classe.colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> persona = new HashSet<Usuario>();

        persona.add(new Usuario("Pedro"));
        persona.add(new Usuario("Mara"));
        persona.add(new Usuario("Luis"));

        boolean resultado = persona.contains(new Usuario("Mara"));
        System.out.println(resultado);



    }



}
