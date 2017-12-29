package Selecao_FIFA;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Temporada 
{
	private Calendar dataInicio;
	private Calendar dataFim;
	private String dia;
	private String mes;
	private String ano;
	
	public void setDataInicio(int ano, int dia) 
	{
		this.dataInicio = new GregorianCalendar(ano, Calendar.AUGUST+1, dia);
	}
	
	public String getDataInicio() 
	{
		dia = Integer.toString(dataInicio.get(Calendar.DAY_OF_MONTH));
		mes = Integer.toString(dataInicio.get(Calendar.MONTH));
		ano = Integer.toString(dataInicio.get(Calendar.YEAR));
		return dia+"/"+mes+"/"+ano;
		//return dataInicio.get(Calendar.YEAR);
	}
	
	public void setDataFim(int ano, int dia) 
	{
		this.dataFim = new GregorianCalendar(ano, Calendar.JUNE+1, dia);
	}
	public String getDataFim()
	{
		dia = Integer.toString(dataFim.get(Calendar.DAY_OF_MONTH));
		mes = Integer.toString(dataFim.get(Calendar.MONTH));
		ano = Integer.toString(dataFim.get(Calendar.YEAR));
		//return dataFim.get(Calendar.YEAR);
		return dia+"/"+mes+"/"+ano;
	}
	
}
