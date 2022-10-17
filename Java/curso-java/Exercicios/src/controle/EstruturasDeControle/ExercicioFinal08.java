package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal08 {

//	Criar um programa que receba uma palavra e imprime no console letra por letra.
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite uma palavra qualquer: ");
		String palavra = entrada.next().toUpperCase();
		char letras[] = palavra.toCharArray();
		
		for (int i = 0 ;i < letras.length ;i++) {
			System.out.println(letras[i]);
			
			entrada.close();
		}		
	}

}
