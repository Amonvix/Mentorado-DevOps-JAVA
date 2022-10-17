package fundamentos;

import javax.swing.JOptionPane;


// Transformando string em numero


public class StringToNum {
	
	public static void main(String[] args) {
		String val1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		
		
		String val2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
		
		System.out.println(val1+" mais "+val2);
		
		double numero1 = Double.parseDouble(val1);
		double numero2 = Double.parseDouble(val2);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma dos valores informados é "+ soma);
		System.out.println("A média dos valores informados é "+ soma/2);
		
		
		
				
	}

}
