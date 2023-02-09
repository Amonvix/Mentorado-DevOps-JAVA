package fundamentos.ConceitosBasicos;

import java.util.Scanner;

public class ExercicioFinal03 {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		// Formula:  IMC = PESO / (ALTURA)²
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o seu peso?: (xx,xx Kg)");
		double peso = entrada.nextDouble();
		
		
		System.out.print("E a sua altura?: (x,xx metros)");
		String altura =  entrada.next();
		double alt = Double.parseDouble(altura);
		
		alt = Math.pow(alt, 2);
		
		double IMC = peso / alt;
		
		System.out.printf("%.2f",IMC);
		
		
		
	entrada.close();
	
	}

}
