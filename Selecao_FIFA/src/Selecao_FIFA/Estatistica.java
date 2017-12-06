package Selecao_FIFA;

public class Estatistica 
{
	private int gols;
	private int assistencias;
	private int jogos;
	
	public void setGols(int gols) 
	{
		this.gols = gols;
	}
	public int getGols() 
	{
		return gols;
	}
	
	public void setAssistencias(int assistencias) 
	{
		this.assistencias = assistencias;
	}
	public int getAssistencias() 
	{
		return assistencias;
	}
	
	public void setJogos(int jogos) 
	{
		this.jogos = jogos;
	}
	public int getJogos() 
	{
		return jogos;
	}
	
	public float mediaGols() 
	{
		float mediaGols = jogos/gols;
		return mediaGols;
	}
}
