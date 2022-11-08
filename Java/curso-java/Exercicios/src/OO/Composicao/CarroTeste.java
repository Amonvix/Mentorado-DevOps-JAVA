package OO.Composicao;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        c1.estaLigado();
        if (!c1.estaLigado()){
            c1.ligar();
        }
    System.out.println(c1.estaLigado());

    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    c1.frear();
    System.out.println(c1.motor.giros());

    }
}
