package Generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Mario");
		resultadoConcurso.adicionar(3, "Dario");
		resultadoConcurso.adicionar(4, "Luiz");
		resultadoConcurso.adicionar(2, "Pedro");
		
		System.out.println(resultadoConcurso.getValue(2));
		
	}

}
