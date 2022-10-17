package fundamentos.ConceitosBasicos;

import java.util.Scanner;

public class ExercicioFinal02 {
	
	public static void main(String[] args) {
	
	//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	
	//°F = (°C + 32) / (5*9)
	//(F° - 32) * (5/9) = C° ou °F = °C × 1,8 + 32		>>>Calculo usado para conversão de temperaturas

	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura Celcius vamos converter para Fahrenheit? ");
		double celcius = entrada.nextDouble();
		
		double dif = 32;
		double fator = 1.8;
		
		double fahrenheit= (celcius * fator) + dif;
		
		System.out.printf("A temperatura de %.2f° Celcius, convertido para Fahrenheit é igual a %.2f° F.", celcius,fahrenheit  );

	
	entrada.close();
	}
	
	
}
