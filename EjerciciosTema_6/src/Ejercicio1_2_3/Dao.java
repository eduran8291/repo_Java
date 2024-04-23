package Ejercicio1_2_3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	public void testConexion() {
		Connection conn = abrirConexion();
		System.out.println("Esta es mi conexion: " + conn);
		if (conn != null) {
			System.out.println("Todo ok!!");

		} else {
			System.out.println("Esto no rula...");
		}
	}

	protected Connection abrirConexion() {

		String urlConexion = "jdbc:oracle:thin:@//localhost:1521/XE";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "minombre";
		String password = "minombre";
		try {
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(urlConexion, usuario, password);
			return conn;
		} catch (Exception e) {
			System.out.println("NO he podido abrir la conexion. " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("No puedo conectarme a la BBDD");
		}
}
}
