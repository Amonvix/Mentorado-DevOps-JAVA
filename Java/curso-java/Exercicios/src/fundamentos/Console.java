package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");						//print sem quebra de linha
		System.out.println(" dia!\n\n");				//print com quebra de linha e 2 espaço de quebra (\n\n)
		
		System.out.println("Bom");						//print com quebra de linha
		System.out.println("dia!");						//print com quebra de linha
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);	//print formato sem quebra de linha, com substituição de valores
		
		System.out.printf("Salário: %.1f%n", 1234.5678);					//print formato sem quebra de linha, com substituição de valores
		System.out.printf("Nome: %s%n", "João");							//print formato sem quebra de linha, com substituição de valores
		
		Scanner entrada = new Scanner(System.in);		// comando usado para scannear entrada de dados (System.in) aponta para o teclado
		
		System.out.print("Digite seu nome: ");			// printa o que precisa ser digitado
		String nome = entrada.nextLine().toUpperCase();				// armazena o que foi digitado na variavel nome

		System.out.print("Digite seu sobrenome: ");		// printa o que precisa ser digitado
		String sobrenome = entrada.nextLine().toUpperCase();			// armazena o que foi digitado na variavel sobrenome
		
		System.out.print("Digite sua idade: ");			// printa o que precisa ser digitado
		int idade = entrada.nextInt();					// armazena o que foi digitado na variavel idade
		
		System.out.printf("\n\n %s %s tem %d de idade.%n", nome, sobrenome, idade); 		// printa de forma formatada o que esta armazenado nas variaveis
		
		entrada.close(); 								//sempre que algo for iniciado, precisa ser terminado para economia de memoria
		
		
	}

}
