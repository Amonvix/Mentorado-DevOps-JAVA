package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        
        double notasAlunoA[] = new double [4];
        notasAlunoA[0] = 6.9;
        notasAlunoA[1] = 7;
        notasAlunoA[2] = 9.9;
        notasAlunoA[3] = 10;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println("*******************************");
        System.out.println("*******************************");

        double totalAlunoA = 0;
        for(int i = 0; i< notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
            System.out.println(notasAlunoA[i]);
        }

        System.out.println(totalAlunoA / notasAlunoA.length);
        System.out.println("*******************************");
        System.out.println("*******************************");

        double notasAlunoB[] = {6.5, 5.9, 7.8, 9};
        
        double totalAlunoB = 0;
        for (int i=0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
            System.out.println(notasAlunoB[i]);
        }
        System.out.println("*******************************");
        System.out.println("*******************************");

        System.out.println(totalAlunoB / notasAlunoB.length);


    }
    
}
