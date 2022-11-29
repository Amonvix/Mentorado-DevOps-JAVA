package OO.Polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa (double peso){
        setPeso(peso);
    }

    public void Comer(Comida comida){
        this.peso += comida.getPeso();
    }

    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double novoPeso) {
        if (novoPeso >= 0) {
            this.peso = novoPeso;
        }
    }
    
}
