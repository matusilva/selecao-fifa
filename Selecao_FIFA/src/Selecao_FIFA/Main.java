package Selecao_FIFA;

public class Main 
{
	static private Jogador jogadores[];
	static private int quantidadeDeJogadores;
	
	public void adicionarJogador(Jogador novoJogador) 
	{
		jogadores[quantidadeDeJogadores] = novoJogador;
		quantidadeDeJogadores++;
	}
	
	public Jogador buscarJogador(String nome) 
	{

		for (int i = 0; i < quantidadeDeJogadores; ++i) 
		{
			String j = jogadores[i].getNome();
			if (nome.equals(j))
				return jogadores[i];
		}
		return null;
	}
	
	
	public static void menu() 
	{
		System.out.println("1 - Adicionar Jogador a Seleção");
		System.out.println("2 - Pesquisar Jogador pelo Nome");
		System.out.println("3 - Pesquisar Jogador pela Posição\n");
		System.out.println("Digite as opções para Acessar o Menu:");
	}
	
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Jogador jogador = new Jogador();
		Usuario usuario = new Usuario();
		
		System.out.println("Digite Seu Nome para Entrar:");
		String nome = sc.nextLine();
		usuario.setNome(nome);
		System.out.println("----Olá "+ usuario.getNome() +", Bem Vindo!----\n");
		int opcao;
		
		do {
		menu();
		opcao = sc.nextInt();
		} while(opcao != 9);
	}
}
