package classe.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1,"Ana");      //adiciona o item e o valor na primeira posição        
        usuarios.put(2,"Tulio");    //adiciona o item e o valor na segunda posição    
        usuarios.put(3,"José");     //adiciona o item e o valor na terceira posição    
        usuarios.put(4,"Maria");    //adiciona o item e o valor na quarta posição        
        usuarios.put(4,"Mario");    //substitui o item e o valor na quarta posição    
        
        


        System.out.println(usuarios.size());        
        System.out.println(usuarios.isEmpty());         


        System.out.println(usuarios.keySet());         
        System.out.println(usuarios.values());        
        System.out.println(usuarios.entrySet()); 
        System.out.println(usuarios.containsKey(20)); 
        System.out.println(usuarios.containsValue("Rebecca")); 
        System.out.println(usuarios.get(4));      

       
      for (int chave : usuarios.keySet()) {
          System.out.println(chave);
        }
        for (String pessoa : usuarios.values()) {
            System.out.println(pessoa);     
           
    
      }


    }
}
