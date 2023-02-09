package fundamentos.operadores;

public class DesafiosAritimeticos {
	
	public static void main(String[] args) {		
		
		int a = 6;
		int b = 3+2;
		int c = 1-5;
		int d = 2-7;
		
		double fator1 = Math.pow(a*b, 2)/(3*2);
		double fator2 = Math.pow(c*d/2, 2);
		double prod = Math.pow(fator1-fator2, 3)/(Math.pow(10, 3));
		
		System.out.println(fator1);
		System.out.println(fator2);
		System.out.println((int)prod);
		
		
	}

}
