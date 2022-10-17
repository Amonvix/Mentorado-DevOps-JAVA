package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	
	public static void main(String[] args) {
		
		
		double a = 1; //conversão implicita
		System.out.println(a);
		
		float b = (float) 1.1234852;	//explicita (CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c;				//conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;				//explicita (CAST)
		System.out.println(f);
		
		
	}

}
