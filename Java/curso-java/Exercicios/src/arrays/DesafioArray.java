package arrays;

import java.util.Scanner;


public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas vamos calcular: ");
        int vezes = entrada.nextInt();
        double notasAluno[] = new double [vezes];
        double soma = 0;

    for(int i = 0; i < vezes ; i++){
        System.out.printf("qual a %d° nota? : ", i+1);
        notasAluno [i] = entrada.nextDouble();
    }
    for(double nota:notasAluno){
        soma += nota;    
    }
    
System.out.print("A soma total das notas é " + soma);
System.out.println("\nA média para este aluno foi de " + soma / vezes);;


        entrada.close();
    }
}
