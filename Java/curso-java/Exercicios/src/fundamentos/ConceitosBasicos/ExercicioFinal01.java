package fundamentos.ConceitosBasicos;

import java.util.Scanner;

public class ExercicioFinal01 {
	
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		//(F° - 32) * (5/9) = C° ou °C = (°F − 32) ÷ 1,8		>>>Calculo usado para conversão de temperaturas
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura Fahrenheit vamos converter para Celcius? ");
		double fahrenheit = entrada.nextDouble();
		
		double dif = 32;
		double fator = 5.0/9;
		
		double celcius = (fahrenheit - dif) * fator;
		
		//System.out.printf("%.2f",celcius);
		System.out.printf("A temperatura de %.2f° Fahrenheit, convertido para Celcius é igual a %.2f° C.", fahrenheit, celcius );
		
		entrada.close();
		
		
		
	}

}
