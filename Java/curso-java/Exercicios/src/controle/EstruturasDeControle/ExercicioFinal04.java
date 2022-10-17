package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal04 {
	
//	4. Criar um programa que receba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int div = 0;
		int num = 0;
			
		System.out.print("Digite um número para verificar o primo");
		num = entrada.nextInt();
		
		
		//Logica
		
		
		for(int i = 2; i < num; i++) {
			
			if (num % i == 0)
				div++;			
		}
		
		if (div == 0)
			System.out.printf("%d é um número Primo", num);
		else
			System.out.printf("%d não é um número Primo", num);
		
		System.out.println("\n\n" + div);
		entrada.close();
	}

}
