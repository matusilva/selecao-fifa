package Selecao_FIFA;

public class Selecao {

	private int quantidadeDeJogadores;
	private Jogador jogadores[];
	
	
	public Selecao() 
	{
		jogadores = new Jogador[11];
		quantidadeDeJogadores = 0;	
	}
	

	void adicionarJogador(Jogador novoJogador) 
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
}
