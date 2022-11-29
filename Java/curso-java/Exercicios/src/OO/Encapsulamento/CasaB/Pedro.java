package OO.Encapsulamento.CasaB;

import OO.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    
    void testeAcessos(){
        // segredo 
        // facoDentrodeCasa
        // formaDeFalar
        // todosSabem
        
        // Ana mae = new Ana();
       
        // System.out.println(mae.segredo);   //Privado
        // System.out.println(mae.facoDentrodeCasa); // Pacote
        System.out.println(formaDeFalar);       // Protected
        System.out.println(todosSabem);
    
}
}
