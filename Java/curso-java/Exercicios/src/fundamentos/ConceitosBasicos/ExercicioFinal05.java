package fundamentos.ConceitosBasicos;

import java.util.Scanner;

public class ExercicioFinal05 {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o tamanho da base do triangulo? ");
		double base = entrada.nextDouble();
		
		System.out.print("Qual a altura do triangulo? ");
		double alt = entrada.nextDouble();

		//Logica
		
		double area = (base * alt) / 2;
		
		System.out.printf("Um triangulo de base %.2f e altura %.2f tem a area de %.2f.", base, alt, area);
		
		entrada.close();
		
		
	}

}
