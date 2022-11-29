package OO.heranca.Desafio;

public class Kombi extends Carro implements Luxo{
    public Kombi (int velocidade){
        super(velocidade);
    }

    @Override
    public void ligarAR() {
        setVelmed(2);
    }

    @Override
    public void desligarAR() {
        setVelmed(5);
    }
    
}
