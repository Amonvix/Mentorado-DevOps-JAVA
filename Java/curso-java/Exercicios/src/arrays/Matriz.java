package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos?: ");
        int alunos = entrada.nextInt();
        
        
        
        System.out.print("Quantas notas vamos calcular: ");
        int notas = entrada.nextInt();



        double SalaAula[][] = new double [alunos][notas];
       
        double soma = 0;

        for (int a = 0; a < SalaAula.length; a++) {
            for (int n = 0; n < SalaAula[a].length; n++) {
                System.out.printf("\nInforme as notas %d do %d° aluno: ",(n+1) ,(a+1));
                SalaAula[a][n] = entrada.nextDouble();
                soma+=SalaAula[a][n];                
            }           
            
        }
        System.out.println("A média da sala de Aula foi de " + (soma / (alunos*notas)));

        entrada.close();
    }
}
    
    

