package OrientacionAObjetos;

public class Libro {

		//creamos atributos
		private static String material;
		private String titulo;
		private String autor;
		private Integer numPagina;
		private String editorial;
		
		public void cambiarTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public Integer getNumPagina() {
			return numPagina;
		}
		public void setNumPagina(Integer numPagina) {
			this.numPagina = numPagina;
		}
		public String getEditorial() {
			return editorial;
		}
		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}
	}


