package arrays;

public class ForEach {
    public static void main(String[] args) {
        
        double notas[] = {9.9 ,8.5, 7.8, 8};
        System.out.println();

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.println();


        for(double nota:notas){
            System.out.print(nota + " ");

        }

        System.out.println();
        System.out.println();

    }
}
