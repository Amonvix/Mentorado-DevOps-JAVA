package OO.heranca.Teste;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;
        
        Monstro monstro = new Monstro(10,11);
        
    

        
        System.out.println("VIDA DO HEROI  => " + heroi.vida);
        System.out.println("VIDA DO MONSTRO  => " + monstro.vida); 


        heroi.atacar(monstro);
        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.andar(Direcao.NORTE);

        heroi.atacar(monstro);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        
        
        System.out.println("VIDA DO HEROI  => " + heroi.vida);
        System.out.println("VIDA DO MONSTRO  => " + monstro.vida);        



    
    
    
    
    
    
    }

}
