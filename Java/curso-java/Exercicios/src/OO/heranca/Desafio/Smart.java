package OO.heranca.Desafio;

public class Smart extends Carro implements Esportivo, Luxo{


    private boolean ligarAR = false;
    private boolean ligarTurbo = false;


    public Smart (){
        this(120);    
    }

    public Smart(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setVelmed(15);     
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;      
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;        
    }

    @Override
    public void ligarAR() {
        ligarAR = true;
    }

    @Override
    public void desligarAR() {
        ligarAR = false;
    }


    @Override
    public int getVelmed() {
        if (ligarTurbo && !ligarAR) {
            return 30;            
        }
        else if (ligarAR && !ligarTurbo){
            return 12;
        }
        else if (ligarTurbo){
            return 35;
        }      
        
            return 5;
        
    }
    
}
