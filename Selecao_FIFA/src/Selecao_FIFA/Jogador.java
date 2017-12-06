package Selecao_FIFA;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jogador 
{
	private String nome;
	private String pais;
	private String time;
	private Calendar dataNascimento;
	private Posicao posicao;
	
	
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return nome;
	}
	
	public void setPais(String pais) 
	{
		this.pais = pais;
	}
	public String getPais() 
	{
		return pais;
	}
	
	public void setTime(String time) 
	{
		this.time = time;
	}
	public String getTime() 
	{
		return time;
	}
	
	public void setDataNascimento(int ano, int mes, int dia) 
	{
		this.dataNascimento = new GregorianCalendar(ano, mes-1, dia);
	}
	
	public String getDataNascimento() {
		return this.dataNascimento.toString();
	}
	public int getIdade() 
	{
		Calendar atual = GregorianCalendar.getInstance();
		int anoAtual = atual.get(Calendar.YEAR);
		int mesAtual = atual.get(Calendar.MONTH);
		int diaAtual = atual.get(Calendar.DAY_OF_MONTH);
		int idade = anoAtual - dataNascimento.get(Calendar.YEAR);
		
		if (dataNascimento.get(Calendar.DAY_OF_MONTH) >= diaAtual && dataNascimento.get(Calendar.MONTH) >= mesAtual) 
		{
			idade--;
		} 
		
		return idade;
	}
	
}
