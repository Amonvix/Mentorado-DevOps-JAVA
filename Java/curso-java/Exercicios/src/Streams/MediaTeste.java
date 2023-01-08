package Streams;

public class MediaTeste {
    public static void main(String[] args) {
        
        Media m1 = new Media().adicionar(10).adicionar(7);
        // m1.adicionar(10);
        // m1.adicionar(10);
        
        Media m2 = new Media().adicionar(9).adicionar(8);
    

        System.out.println(Media.juntar(m1, m2).getValor());

    }
}
