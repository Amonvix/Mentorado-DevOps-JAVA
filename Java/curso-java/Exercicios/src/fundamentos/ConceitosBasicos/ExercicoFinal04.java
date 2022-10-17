package fundamentos.ConceitosBasicos;

import java.util.Scanner;

public class ExercicoFinal04 {
	
	
	public static void main(String[] args) {
		
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o valor a ser calculado?: ");
		double num = entrada.nextDouble();
		double quad = Math.pow(num, 2);
		double cub = Math.pow(num, 3);
		

		System.out.printf("O numero %.0f elevado ao quadrado é igual a %.0f %n",num, quad);
		System.out.printf("O numero %.0f elevado ao  cubo é igual a %.0f",num , cub);
				
		
		entrada.close();
	}
}
