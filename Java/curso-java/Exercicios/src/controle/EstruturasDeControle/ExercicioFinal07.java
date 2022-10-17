package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal07 {
	
//	7. Criar um programa que enquanto estiver recebendo números positivos, 
//	imprime no console a soma dos números inseridos, 
//	caso receba um número negativo, encerre o programa. 
//	Tente utilizar a estrutura do while.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
		System.out.println("Digite um valor a ser somado.\nPara sair, digite qualquer valor negativo!");
		numero = entrada.nextInt();
			if (numero > 0)
				soma += numero ;
		} while (numero > 0);
		
		System.out.println("O valor total somado foi " + soma);
		entrada.close();
	}

}
