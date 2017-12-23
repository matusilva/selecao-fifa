package Selecao_FIFA;
import java.util.ArrayList;

public class Main 
{
	static ArrayList<Jogador> jogadores;
	static ArrayList<Posicao> posicoes;
	
	public static void menu() 
	{
		System.out.println("---- MENU DA SELEÇÃO DA FIFA ----");
		System.out.println("1 - Cadastrar Jogador na Seleção:");
		System.out.println("2 - Pesquisar Jogador pelo Nome:");
		System.out.println("3 - Remover Jogador:");
		System.out.println("4 - Listar Jogadores Cadastrados:");
		System.out.println("5 - Cadastrar Posição:");
		System.out.println("6 - Pesquisar Posição Cadastrada:");
		System.out.println("7 - Remover Posição");
		System.out.println("8 - Adicionar Posição ao Jogador");
		System.out.println("9 - Pesquisar Jogador pela Posição");
		System.out.println("10 - SAIR:");
		System.out.println("\nDigite as opções para Acessar o Menu:");
	}
	public static void menuPosicoes() 
	{
		System.out.println("---- MENU DE POSIÇÕES ----");
		System.out.println("---- Goleiro ----");
		System.out.println("---- Defensor ----");
		System.out.println("---- Meia ----");
		System.out.println("---- Atacante ----");
	}
	
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		jogadores = new ArrayList<Jogador>();
		posicoes = new ArrayList<Posicao>();
		Usuario usuario = new Usuario();
		Estatistica status = new Estatistica();
		System.out.println("Digite Seu Nome para Entrar:");
		String nomeUsuario = sc.nextLine();
		usuario.setNome(nomeUsuario);
		System.out.println("----Olá "+ usuario.getNome() +", Bem Vindo!-----\n");
		int opcao;
		
		do {
		menu();
		opcao = sc.nextInt();
		
		if(opcao == 1) 
		{
			System.out.println("Digite o Nome do Jogador: ");
			String nomeJogador = sc.next();
			Jogador jogador = new Jogador();
			jogador.setNome(nomeJogador);
			jogadores.add(jogador);
			
			System.out.println("Digite a nacionalidade: ");
			String pais = sc.next();
			System.out.println("Digite o Time que Joga: ");
			String time = sc.next();
			
			System.out.println("Digite a quantidade de Jogos na temporada: ");
			int jogos = sc.nextInt();
			
			System.out.println("Digite a quantidade de Gols na temporada: ");
			int gols = sc.nextInt();
			
			System.out.println("Digite a quantidade de Assistências na temporada ");
			int assist = sc.nextInt();
			
			jogador.setTime(time);
			jogador.setPais(pais);
			status.setJogos(jogos);
			status.setGols(gols);
			status.setAssistencias(assist);

			System.out.println("--- Jogador Cadastrado com Sucesso! ---");
			System.out.println("Jogador: " + jogador.getNome()+ "\n" + "Nacionalidade: " + jogador.getPais() + "\n" + "Time: " + jogador.getTime());
			System.out.println("Media: " + status.mediaGols() + "\n" + "Total de Participação em Gols: " + status.participacaoGols());
			
			
		}
		
		if(opcao == 2) 
		{
			System.out.println("Digite o Nome do Jogador que você quer pesquisar:");
			String nomeJogador = sc.next();
			Jogador jogador = null;
			for (int i = 0; i < jogadores.size(); i++) 
			{
				Jogador j = jogadores.get(i);
				if (j.getNome().equals(nomeJogador)) 
				{
					jogador = j;
					break;
				}
			}
			if (jogador == null) 
			{
				System.out.println("Jogador não encontrado!\n");
			} else 
			{
				System.out.println("Jogador encontrado: "+jogador.getNome()+"\n");
			}
		}
		
		if(opcao == 3) 
		{
			System.out.println("Digite o Jogador que será Removido:");
			String nomeJogador =  sc.next();
			Jogador jogador = null;
			for(int i = 0; i < jogadores.size(); i++) 
			{
				Jogador j = jogadores.get(i);
				if(j.getNome().equals(nomeJogador)) 
				{
					jogador = j;
					break;
					
				}
			}
			if(jogador == null) 
			{
				System.out.println("Jogador não encontrado!");
			} else 
			{
				System.out.println("Jogador Removido: "+jogador.getNome());
				jogadores.remove(jogador);
			}
		}
		
		if(opcao == 4) 
		{
			System.out.println("Jogadores Cadastrados:\n");
			if(jogadores.isEmpty()) 
			{
				System.out.println("Nenhum Jogador foi cadastrado!\n");
			}else {
				for(int i = 0; i < jogadores.size(); i++)
				{
					Jogador lista = jogadores.get(i);
					System.out.println(lista);
				}
			}
		}
		
		if(opcao == 5) 
		{
			menuPosicoes();
			System.out.println("Digite a Posição");
			String nomePosicao = sc.next();
			Posicao posicao = new Posicao();
			posicao.setNome(nomePosicao);
			posicoes.add(posicao);
			System.out.println("Posição Cadastrada com Sucesso!\n");
		}
		
		if(opcao == 6) 
		{
			System.out.println("Digite a posicao");
			String novaPosicao = sc.next();
			Posicao posicao = null;
			for (int i = 0; i < posicoes.size(); i++) 
			{
				Posicao p = posicoes.get(i);
				if (p.getNome().equals(novaPosicao)) 
				{
					posicao = p;
					break;
				}
			}
			if(posicao == null) {
				System.out.println("Posicao não cadastrada!");
			}
			else {
				System.out.println("Posição encontrada: " + posicao.getNome());
			}
		}
		
		if(opcao == 7) 
		{
			System.out.println("Digite a Posição que será Removida:");
			String nomePosicao =  sc.next();
			Posicao posicao = null;
			for(int i = 0; i < posicoes.size(); i++) 
			{
				Posicao p = posicoes.get(i);
				if(p.getNome().equals(nomePosicao)) 
				{
					posicao = p;
					break;
					
				}
			}
			if(posicao == null) 
			{
				System.out.println("Posição não encontrada!");
			} else 
			{
				System.out.println("Posição Removida: "+posicao.getNome());
				posicoes.remove(posicao);
			}
		}
		
		if(opcao == 8) 
		{	
			System.out.println("Digite nome do jogador a ser adicionado");
			String nomeJogador = sc.next();
			
			Posicao posicao = null;
			Jogador jogador = null;
			
			for(int i = 0 ; i < jogadores.size(); i++) 
			{
				Jogador j = jogadores.get(i);
				if(j.getNome().equals(nomeJogador)) 
				{
					jogador = j;
				}
			}
			if (jogador == null) 
			{
				System.out.println("Jogador não encontrado!\n");
			} else {
				System.out.println("Jogador encontrado: "+jogador.getNome());
				
				//Listar posicoes
				System.out.println("Posições Cadastradas:");
				for (int i = 0 ; i < posicoes.size(); i++) 
				{
					System.out.println(" " + i + " - "+posicoes.get(i).getNome());
				}
				// pedir para usuario digitar numero da posicao
				System.out.println("Digite o numero da posição:");
				int p = sc.nextInt();
				if(p == 0 || p == 1 || p == 2 || p == 3) 
				{
					posicao = posicoes.get(p);
					jogador.setPosicao(posicao);
					System.out.println("Jogador " + jogador.getNome() + " foi cadastrado na Posição "+ jogador.getPosicao() + " com Sucesso!\n");
				}else {
					System.out.println("Numero da Posição não encontrado!\n");
				}
			 }
		}
		
		if(opcao == 9) 
		{
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < jogadores.size(); ++i) 
			{
				Jogador j = jogadores.get(i);
				sb.append(j.getPosicao());
				sb.append(": ");
				sb.append(j.getNome());
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}
			
		} while(opcao != 10);{
			sc.close();
			System.exit(0);
		}
	}
}
