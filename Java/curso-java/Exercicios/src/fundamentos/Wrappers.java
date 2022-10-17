package fundamentos;

public class Wrappers {
	
	
	//forma de usar notação ponto com valore primitivos
	
	
	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//INT
		Integer i = 10000;
		Long l = 10000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//FLOAT
		Float f = 123.12F;
		System.out.println(f);
		
		
		//Double
		Double d = 1234.5679;
		System.out.println(d);
		
		
		
		
		//BOOL
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		//CHAR
		Character c = '$';
		System.out.println(c.toString());
		
		
		
		
	}

}
