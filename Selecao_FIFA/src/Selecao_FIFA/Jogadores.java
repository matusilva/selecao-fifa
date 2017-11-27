package Selecao_FIFA;

public class Jogadores {
	Selecao s = new Selecao();
	
	Selecao MostarSelecao() {
		System.out.println("--SELEÇÃO DA FIFA:--\n");
		System.out.println("1 - Gianluigi Buffon");
		System.out.println("2 - Daniel Alves");
		System.out.println("3 - Leonardo Bonucci");
		System.out.println("4 - Sergio Ramos");
		System.out.println("5 - Marcelo");
		System.out.println("6 - Toni Kroos");
		System.out.println("7 - Luka Modric");
		System.out.println("8 - Andrés Iniesta");
		System.out.println("9 - Cristiano Ronaldo");
		System.out.println("10 - Lionel Messi");
		System.out.println("11 - Neymar Júnior\n");
			
		return null;
		
	}
	Selecao Detalhar(int numero) {
		if (numero == 1) {
			System.out.println("Gianluigi Buffon");
		}
		if (numero == 2) {
			System.out.println("Daniel Alves");
		}
		if(numero == 3) {
			System.out.println("Leonardo Bonucci");
		}
		if(numero == 4) {
			System.out.println("Sergio Ramos");
		}
		if(numero == 5) {
			System.out.println("Marcelo");
		}
		if(numero == 6) {
			System.out.println("Toni Kroos");
		}
		if(numero == 7) {
			System.out.println("Luka Modric");
		}
		if(numero == 8) {
			System.out.println("Andrés Iniesta");
		}
		if(numero == 9) {
			System.out.println("Cristiano Ronaldo");
		}
		if(numero == 10) {
			System.out.println("Lionel Messi");
		}
		if(numero == 11) {
			System.out.println("Neymar Júnior");
		}
		if(numero < 1 || numero > 11) {
			System.out.println("Numero do Jogador não existe");
		}
		return null;
	}
	Selecao Posicao(String posicao) {
		if(posicao.equals("Goleiros")) {
			System.out.println("Gianluigi Buffon");
		}
		else if(posicao.equals("Defensores")) {
			System.out.println("Daniel Alves\nLeonardo Bonnucci\nSergio Ramos\nMarcelo");
		}
		else if(posicao.equals("Meio-Campistas")) {
			System.out.println("Toni Kroos\nLuka Modric\nAndrés Iniesta");
		}
		else if(posicao.equals("Atacantes")) {
			System.out.println("Cristiano Ronaldo\nLionel Messi\nNeymar Júnior");
		}
		else {
			System.out.println("Posição Incorreta");
		}
		return null;
		
		
	}
}
