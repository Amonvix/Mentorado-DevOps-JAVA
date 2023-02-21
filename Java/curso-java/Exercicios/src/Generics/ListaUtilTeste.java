package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "PYTHON", "C#");
		List<Integer> nuns = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		String ultimaLinguagem = (String)ListaUtil.getUltimo(langs);
		Integer ultimoNumero = (Integer)ListaUtil.getUltimo(nuns);
		
		System.out.println(ultimaLinguagem);
		System.out.println(ultimoNumero);
		
		
		
		String ultimaLinguagem1 = ListaUtil.getUltimo2(langs);
		Integer ultimoNumero1 = ListaUtil.getUltimo2(nuns);
		
		System.out.println(ultimaLinguagem1);
		System.out.println(ultimoNumero1);
		
	}

}
