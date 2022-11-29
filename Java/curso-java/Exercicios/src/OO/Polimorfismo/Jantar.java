package OO.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa convidado = new Pessoa(99.65);

        Arroz porcaoArroz = new Arroz(0.25);
        Feijao porcaFeijao = new Feijao(.18);
        Sorvete bolaSorvete = new Sorvete(.5);
        Comida pratoFeito = new Arroz(1.5);
        
        System.out.println(convidado.getPeso());

        convidado.Comer(porcaoArroz);
        convidado.Comer(porcaoArroz);
        convidado.Comer(porcaFeijao);
        System.out.println(convidado.getPeso());
        convidado.Comer(bolaSorvete);
        convidado.Comer(bolaSorvete);
        convidado.Comer(bolaSorvete);
        convidado.Comer(bolaSorvete);
        convidado.Comer(pratoFeito);


        System.out.println(convidado.getPeso());


    }
}
