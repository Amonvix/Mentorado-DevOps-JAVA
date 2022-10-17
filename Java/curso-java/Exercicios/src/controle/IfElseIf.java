package controle;

import java.util.Scanner;

public class IfElseIf {
	
	
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();		
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		}
		else if (nota >= 8.1) {
			System.out.print("O aluno é ");	
			System.out.println("Conceito A");
		}
		else if (nota >= 7.1) {
			System.out.print("O aluno é ");	
			System.out.println("Conceito B");
		}
		else if (nota >= 5.1) {
			System.out.print("O aluno é ");	
			System.out.println("Conceito C");
		}
		else if (nota >= 3.1) {
			System.out.print("O aluno é ");	
			System.out.println("Conceito D");
		}else {
			System.out.print("O aluno é ");	
			System.out.println("Conceito E");
		} 
		
		entrada.close();
			
		}		
	}
