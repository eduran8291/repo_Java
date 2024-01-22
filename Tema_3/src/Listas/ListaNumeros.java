package Listas;

public interface ListaNumeros {
	
	public void añadirNumero(Integer numero);
	
	public Integer getNumeroDePosicion(Integer posicion);
	public Integer getPosicionNumero(Integer numero);
	public Integer getResta();
	public Integer sumaTodos();
	public Integer getmedia();
	public Integer getMayor();
	public Integer getMenor();
	public void ordenar();
	public void ordenarInverso();
}
