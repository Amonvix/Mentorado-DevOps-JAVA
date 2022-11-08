package classe.colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();
        
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Luis"));
        System.out.println();
        System.out.println();

       

        System.out.println(lista.get(1));               //usando acesso via index
        
        System.out.println("REMOVIDO>>>" + lista.remove(1));            //remove o item na posição informada
        System.out.println(lista.remove(new Usuario("Maria")));     //remove pelo iqualdade
        System.out.println(lista.get(2));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for (Usuario user : lista) {
            System.out.println(user);                   // usando o modulo toString
        }
        
        
        
    }
}
    