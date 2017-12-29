package Selecao_FIFA;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Main 
{
	static ArrayList<Jogador> jogadores;
	static ArrayList<Posicao> posicoes;
	
	
	public static void menu() 
	{
		System.out.println("----- MENU SELEÇÃO DA FIFA -----");
		System.out.println("1 - Cadastrar Jogador na Seleção:");
		System.out.println("2 - Buscar Jogador Cadastrado:");
		System.out.println("3 - Remover Jogador:");
		System.out.println("4 - Listar Jogadores Cadastrados:");
		System.out.println("5 - Cadastrar Posição:");
		System.out.println("6 - Buscar Posição Cadastrada:");
		System.out.println("7 - Remover Posição");
		System.out.println("8 - Adicionar Posição ao Jogador");
		System.out.println("9 - Listar Jogadores por Posição");
		System.out.println("10 - Inserir Nota ao Jogador");
		System.out.println("0 - SAIR:");
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
		Temporada temporada = new Temporada();
		
		System.out.print("Digite Seu Nome para Entrar: ");
		String nomeUsuario = sc.nextLine();
		usuario.setNome(nomeUsuario);
		System.out.println("----Olá "+ usuario.getNome() +", Bem Vindo!-----");
		
		System.out.println("Digite a Data da temporada Inical: ");
		int diaI, anoI;
		System.out.print("Ano: ");
		anoI = sc.nextInt();
		System.out.print("Dia: ");
		diaI = sc.nextInt();		
		temporada.setDataInicio(anoI, diaI);
		
		System.out.println("Digite a Data da temporada Final: ");
		int diaF, anoF;
		System.out.print("Ano: ");
		anoF = sc.nextInt();
		System.out.print("Dia: ");
		diaF = sc.nextInt();
		temporada.setDataFim(anoF, diaF);
		
		int opcao;
		do {
		
		System.out.println("TEMPORADA: "+ temporada.getDataInicio()+ " / " + temporada.getDataFim());
		menu();
		opcao = sc.nextInt();
		
		if(opcao == 1) 
		{
			System.out.println("Digite o Nome do Jogador: ");
			String nomeJogador = sc.next();
			
			System.out.println("Digite a nacionalidade: ");
			String pais = sc.next();
			
			System.out.println("Digite o Time que Joga: ");
			String time = sc.next();
			
			System.out.println("Data de nascimento ");
			int dianasc, mesnasc, anonasc;
			System.out.print("Dia: ");
			dianasc = sc.nextInt();
			System.out.print("Mês: ");
			mesnasc = sc.nextInt();
			System.out.print("Ano: ");
			anonasc = sc.nextInt();
	
			System.out.println("Digite a quantidade de Jogos na temporada: ");
			int jogos = sc.nextInt();
			System.out.println("Digite a quantidade de Gols na temporada: ");
			int gols = sc.nextInt();
			System.out.println("Digite a quantidade de Assistências na temporada ");
			int assist = sc.nextInt();
			
			Jogador jogador = new Jogador();
			jogador.setNome(nomeJogador);
			jogador.setPais(pais);
			jogador.setTime(time);
			jogador.setDataNascimento(anonasc, mesnasc, dianasc);
			
			status.setJogos(jogos);
			status.setGols(gols);
			status.setAssistencias(assist);
			
			jogadores.add(jogador);
			System.out.println("--- Jogador Cadastrado com Sucesso! ---");
			System.out.println("Jogador: " + jogador.getNome()+ "\n" + "Nacionalidade: " + jogador.getPais() + "\n" + "Time: " + jogador.getTime() + "\n" + "Idade: " + jogador.getIdade()+ " anos");
			System.out.println("Media de " + status.mediaGols() +"por jogo" + "\n" + "Total de Participação em Gols: " + status.participacaoGols());
			
		}
		
		if(opcao == 2) 
		{
			System.out.println("Digite o Nome do Jogador que você quer buscar:");
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
				System.out.println("Jogador encontrado: "+jogador.getNome());
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
			System.out.println("Jogadores Cadastrados:");
			if(jogadores.isEmpty()) 
			{
				System.out.println("Nenhum Jogador foi cadastrado!\n");
			}else {
				for(int i = 0; i < jogadores.size(); i++)
				{
					Jogador lista = jogadores.get(i);
					System.out.println(lista.getPosicao()+ ": " + lista.getNome());
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
				
				System.out.println("Posições Cadastradas:");
				for (int i = 0 ; i < posicoes.size(); i++) 
				{
					System.out.println(" " + i + " - "+posicoes.get(i).getNome());
				}
				
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
			System.out.println("Digite a Posição:");
			String nomePosicao = sc.next();
			ArrayList<Jogador> lista = jogadores;
			int i;
			if(posicoes.isEmpty()) 
			{
				System.out.println("Nenhuma Posição foi cadastrada!\n");
			}else {
				for(i = 0; i < lista.size(); i++)
				{
					Jogador j = lista.get(i);
					//Jogador lista = jogadores.get(i);
					if(j.getPosicao().toString().equals(nomePosicao)) 
					{	
						System.out.println(j.getNome());
					}
					
				}
				
			}
		}
		
		if(opcao == 10) 
		{
			Nota n = new Nota();
			System.out.println("Digite o nome do Jogador que deseja dar a nota");
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
				System.out.println("Digite seu Voto");
				int nota = sc.nextInt();
				n.setNota(nota);
				System.out.println("NOTA:" + n.getNota() + " para " + jogador.getNome());
				//System.out.println("Jogador encontrado: "+jogador.getNome());
			}
		}
		
		
			
		} while(opcao != 0);{
			sc.close();
			System.exit(0);
		}
	}
}
