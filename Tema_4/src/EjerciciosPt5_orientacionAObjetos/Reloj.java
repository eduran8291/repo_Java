package EjerciciosPt5_orientacionAObjetos;

import java.util.Objects;

public class Reloj {
	protected Integer horas, minutos, segundos;
	protected Boolean formato24Horas;
	
	public Reloj() {
	this.horas = 0;
	this.minutos = 0;
	this.segundos = 0;
	this.formato24Horas = true;
	}
	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24Horas = true;
		
	}
	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}
	
	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}
	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public Boolean check() {
		return (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59);
		
	}
	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		if (formato24Horas || horas <= 12) {
			String cadena = formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);
			if (!formato24Horas) {
				cadena += " am";
			}
			return cadena;
		}
		return formatNumber(horas-12) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos) + " pm";
	}
	
	
	private String formatNumber(Integer x) {
		if (x >= 10) {
			return x.toString();
		}
		return "0" + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
}
	
	



