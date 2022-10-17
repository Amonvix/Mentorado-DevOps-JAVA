package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal01 {
//	
//	1. Criar um programa que receba um número e verifique se ele 
//	está entre 0 e 10 e se é par;
	
	public static void main(String[] args) 
	{		
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Favor digitar um número válido: ");
		num = entrada.nextInt();
		
		while (num < 0 || num > 10) 
		{
			System.out.println("*** Valor digitado inválido!!! *** ");
			System.out.print("Favor digitar um número válido entre 0 e 10 : ");
			num = entrada.nextInt();			
		}
		// logica
		
		int par = num%2;
		
		if(par == 0)
			System.out.printf("%d é PAR! ", num);
		else
			System.out.printf("%d é ÍMPAR! ", num);
		
		entrada.close();
		
	}
	
	

}
