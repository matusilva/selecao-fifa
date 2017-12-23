package Selecao_FIFA;

public class Estatistica 
{
	private float gols;
	private float assistencias;
	private float jogos;
	
	public void setGols(float gols) 
	{
		this.gols = gols;
	}
	public float getGols() 
	{
		return gols;
	}
	
	public void setAssistencias(float assistencias) 
	{
		this.assistencias = assistencias;
	}
	public float getAssistencias() 
	{
		return assistencias;
	}
	
	public void setJogos(float jogos) 
	{
		this.jogos = jogos;
	}
	public float getJogos() 
	{
		return jogos;
	}
	
	public float mediaGols() 
	{
		float mediaGols = gols/jogos;
		return mediaGols;
	}
	public float participacaoGols() 
	{
		float participacaoGols = gols + assistencias;
		return participacaoGols;
	}
	
}
