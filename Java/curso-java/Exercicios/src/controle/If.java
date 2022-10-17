package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a nota:>>> ");
		double nota = entrada.nextDouble();
		
		if (nota > 7) {
			System.out.println("Aluno aprovado");
		} 
		
		if (nota >= 5 && nota < 7) {
			System.out.println("Aluno em Recuperação");
		}
		if (nota < 5) {
			System.out.println("Aluno Reprovado");
			
		}
		entrada.close();
	}

}
