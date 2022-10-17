package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal06 {

//	6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
//	Armazene um numero aleatório em uma variável. 
//	O Jogador tem 10 tentativas para adivinhar o número gerado. 
//	Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
//	e imprima se o número inserido é maior ou menor do que o número armazenado.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int key = 80;
		int jog;
		
		System.out.print("Digite um numero entre 0 - 100:   ");
		jog = entrada.nextInt();
		while (jog < 0 || jog > 100) {
			System.out.println("NUMERO INVALIDO!");
			System.out.print("Digite um numero entre 0 - 100:   ");
			jog = entrada.nextInt();}		
		//Logica
		
		if (jog==key)
			System.out.printf("PARABÉNS... VOCÊ ACERTOU!!! %d É O NUMERO SECRETO!!!", key);
			
		else	  
		for (int i = 9; i > 0; i--) {

			if(jog < key) {
				System.out.println("O número informado é menor que o numero secreto");					
			}
			if(jog > key) {
				System.out.println("O número informado é maior que o numero secreto");}
			
				System.out.printf("*** RESTAM %d TENTATIVAS ***", i);
				System.out.print("Digite um numero entre 0 - 100:   ");
				jog = entrada.nextInt();
				
				
				if (jog==key) {
					System.out.printf("PARABÉNS... VOCÊ ACERTOU!!! %d É O NUMERO SECRETO!!!", key);
					break;}
				else if (i == 1) {
					System.out.println("Você não acertou, tente novamente!");
					System.out.println("O numero secreto era " + key);}
		}
				
				entrada.close();
				
		}	}	
		

	


