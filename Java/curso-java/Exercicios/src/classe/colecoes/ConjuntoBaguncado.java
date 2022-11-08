package classe.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.3);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add('#');
        conjunto.add(1);

        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.contains(1));

        Set num = new HashSet();

        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(num);
        System.out.println(conjunto);
        conjunto.addAll(num);       //Merge entre as coleções
        conjunto.retainAll(num);    //mantem somente os valores em comum entre as coleções
        conjunto.clear();           // apaga o conteudo armazenado na coleção


        System.out.println(conjunto);

    }
}
