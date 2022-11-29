package OO.heranca.Teste;

import OO.heranca.Desafio.Kombi;
import OO.heranca.Desafio.Smart;

public class CarroFuncionando {
    public static void main(String[] args) {

        Kombi kombi = new Kombi(80);

        kombi.desligarAR();
        System.out.println(kombi);
        kombi.acelerar();
        System.out.println(kombi);
        kombi.acelerar();
        System.out.println(kombi);
        kombi.acelerar();
        System.out.println(kombi);
        kombi.acelerar();
        System.out.println(kombi);
        
        System.out.println();
        System.out.println("********************************");
        System.out.println("********************************");

        Smart smart = new Smart();

        smart.desligarTurbo();
        smart.ligarAR();
        System.out.println(smart);
        System.out.println(smart.velocidadeDoAr());
        smart.acelerar();
        // System.out.println(smart);
        // smart.acelerar();
        // System.out.println(smart);
        // smart.acelerar();
        // System.out.println(smart);
        // smart.acelerar();
        // System.out.println(smart);
        // smart.acelerar();
        // System.out.println(smart);
        // smart.acelerar();
        }
    
}
