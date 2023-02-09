package com.amon.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.amon.cm.excecao.ExplosaoException;
import com.amon.cm.excecao.SairException;
import com.amon.cm.modelo.Campo;
import com.amon.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {		
		this.tabuleiro = tabuleiro;
		
		executarJogo();
		
	}

	private void executarJogo() {
		
		try {
			boolean continuar = true;
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida ? (S/n)");
				String resposta = entrada.nextLine();
				
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;					
				}else {
					tabuleiro.reiniciar();
				}
			}
			
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		}
		
		finally {
			entrada.close();
		}
		
	}

	private void cicloDoJogo() {
		try {
			
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturaValorDigitado("Digite (x , y): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
				.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturaValorDigitado("1 - Abrir // 2 - (Des)Marcar :");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if ("2".equals(digitado)) {
					tabuleiro.marcar(xy.next(), xy.next());					
				}else {
					throw new SairException();
				}
			}
			
			System.out.println("Você Ganhou!!!" );
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você PERDEU!!!" );
			
		}
		
	}
	
	private String capturaValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
