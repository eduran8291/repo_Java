package Listas;

public interface Fecha {
	
	public void cambiar(Integer dia,Integer mes,Integer año);
	
	public void actual(String hoy);
	
	public String toString();
	
	public Boolean validar();
	
	public  void cambiarFormato(String patron);
	
	public Boolean equals(Boolean object);
	
	public Integer getDiaMes();
	
	public Integer getDia();
	
	public Integer getMes();
	
	public Integer getAño();
	
	public String getDiaSemana();
	
	public void sumarDia(Integer dia);
	
	public void sumarMes(Integer mes);
	
	public void sumarAño(Integer año);
	
	public Boolean isFestivo();
	
	public Fecha restarFecha(Fecha fecha);
	
	public Integer getDiasRestantesAño();
	
	public Boolean isBisiesto();
	
	public Integer getDiferencia(Fecha fecha);
	
	
	
	
	
	
	
	
}