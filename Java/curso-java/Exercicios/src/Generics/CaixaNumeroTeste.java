package Generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaA= new CaixaNumero<>();
		caixaA.guardar (123);
		System.out.println(caixaA.abrir());

		CaixaNumero<Double> caixaB= new CaixaNumero<>();
		caixaB.guardar (3.5);
		System.out.println(caixaB.abrir());
		
	}

}
