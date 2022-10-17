package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal05 {
	
	
	//Refatorar o exercício 04, utilizando a estrutura switch
	
	
//	Scanner entrada = new Scanner(System.in);
//	
//	int div = 0;
//	int num = 0;
//		
//	System.out.print("Digite um número para verificar o primo");
//	num = entrada.nextInt();
//	
//	
//	//Logica
//	
//	
//	for(int i = 2; i < num; i++) {
//		
//		if (num % i == 0)
//			div++;			
//	}
//	
//	if (div == 0)
//		System.out.printf("%d é um número Primo", num);
//	else
//		System.out.printf("%d não é um número Primo", num);
//	
//	System.out.println("\n\n" + div);
//	entrada.close();
	
	public static void main(String[] args) {
		
		

		Scanner entrada = new Scanner(System.in);
		
		int div = 0;
		int num = 0;
			
		System.out.print("Digite um número para verificar o primo: ");
		num = entrada.nextInt();
		
		
		//Logica
		
		
		for(int i = 2; i < num; i++) {
			
			if (num % i == 0)
				div++;			
		}
		
		switch (div) {
		case 0: {
			
			System.out.printf("%d é um número Primo", num);
			break;
		}
		default:
			System.out.printf("%d não é um número Primo", num);
		}
		
	}
	
	

}
