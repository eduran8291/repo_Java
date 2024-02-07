package Ejercicio47;

public class App47 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setDni("12345678X");
		cliente.setNombre("Blas de los Montes");
		Carrito carrito = new Carrito(cliente);
		System.out.println(carrito);
		
		Ropa poncho = new Ropa();
		poncho.setDescripcion("Poncho");
		poncho.setColor("Azul");
		poncho.setTalla("XL");
		poncho.setPrecio(20.0);
		
		carrito.addArticulo(poncho);
		carrito.addArticulo(poncho);
		System.out.println(carrito);
		
		Libro libro = new Libro();
		libro.setPrecio(15.0);
		libro.setDescripcion("Así habló Zaratustra");
		libro.setAutor("Nietzsche");
		
		carrito.addArticulo(libro);
		System.out.println(carrito);
		
		carrito.borrarArticulo(poncho);
		System.out.println(carrito);
		System.out.println("Precio medio: " + carrito.getPrecioMedio());
		carrito.vaciarCesta();
		System.out.println(carrito);
		System.out.println("Precio medio: " + carrito.getPrecioMedio());


	}

}
