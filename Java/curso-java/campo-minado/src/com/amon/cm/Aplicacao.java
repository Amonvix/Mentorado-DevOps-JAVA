package com.amon.cm;

import com.amon.cm.modelo.Tabuleiro;
import com.amon.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
//		tabuleiro.abrir(3, 3);
//		tabuleiro.marcar(4, 4);
//		tabuleiro.marcar(4, 5);
//		
//		System.out.println(tabuleiro);
		
	}

}
