package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal03 {

	
//	3. Criar um programa que receba duas notas parciais, calcular a média final. 
//	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
//	caso contrário imprime no console "Reprovado".
	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 0;
		Scanner entrada = new Scanner(System.in);
		
			
		System.out.print("Favor informar a primeira nota do aluno:");
		num1 = entrada.nextDouble();
		while (num1 <0 || num1 >10) {
		System.out.println("Nota inválida... tente novamente!");	
		System.out.print("Favor informar a primeira nota do aluno:");
		num1 = entrada.nextDouble();
		}
		
		
		System.out.println("Agora informe a segunda nota do aluno:");
		num2 = entrada.nextDouble();
		while (num2 <0 || num2 >10) {
			System.out.println("Nota inválida... tente novamente!");	
			System.out.print("Favor informar a segunda nota do aluno:");
			num2 = entrada.nextDouble();
			}
		
		//Logica
		
		double media = (num1+num2) / 2;
		
		if (media >= 7)
			System.out.printf("Aluno APROVADO com média %.2f. PARABÉNS ",media);
		else if(media < 7 && media > 4)
			System.out.printf("Aluno em RECUPERAÇÃO, média %.2f.",media);
		else
			System.out.printf("Aluno REPROVADO, média %.2f.", media);
		entrada.close();
	}
	
	
	
	
	
	
	
	
	
	
}
