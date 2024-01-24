package Interface;

public interface Fecha {
	/**Cambiar la fecha actual con el dia, mes y año indicados
	 * @param dia
	 * @param mes
	 * @param año
	 */
	 
	public void cambiar(Integer dia,Integer mes,Integer año);
	/**Cambiar la fecha actual por el dia, mes y año del dia
	 * 
	 * @param hoy
	 */
	
	public void actual(String hoy);
	
	public String toString();
	
	public Boolean validar();
	
	public  void cambiarFormato(String patron);
	/** Devuelve un booleano indicando si el objeto recibido es una fecha
	 * con el mismo dia, mes y año de la fecha actual.
	 * @param object
	 * @return
	 */
	
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