package OO.heranca.Desafio;

public interface Luxo {
    
    void ligarAR();
    void desligarAR();
    default int velocidadeDoAr(){
        return 1;
    }
}
