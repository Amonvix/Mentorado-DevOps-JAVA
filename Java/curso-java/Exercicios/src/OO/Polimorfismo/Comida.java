package OO.Polimorfismo;

public abstract class Comida {

    private double peso;

    public Comida (double peso){
        setPeso(peso);
    }



    public void setPeso(double novoPeso) {
        if (novoPeso >= 0) {
            this.peso = novoPeso;
        }
    }

    public double getPeso() {
        return peso;
    }
    
}
