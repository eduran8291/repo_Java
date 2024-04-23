package Ejercicio1_2_3_4_5_6;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonaService extends Dao {

	public Persona consultarPersona(String dni) throws NoExistePersonaException {
		String sql = "select * from personas where dni = " + dni;
		List<Persona> persona = new ArrayList<Persona>();
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Persona person = new Persona();
				Date date = rs.getDate("FECHA_NACIMIENTO");
				LocalDate fecha = date.toLocalDate();
				person.setDni(rs.getString("DNI"));
				person.setNombre(rs.getString("NOMBRE"));
				person.setApellido(rs.getString("APELLIDOS"));
				person.setFechaNacimiento(fecha);
				return person;
			}
			if (persona.isEmpty()) {
				throw new NoExistePersonaException("No hay personas con los datos indicados");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERROR");

		}
		return null;

	}
	
	public void insertarPersona(Persona persona) throws ErrorException {
		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try(Connection conn = abrirConexion(); 
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, persona.getDni());
			stmt.setString(2, persona.getNombre());
			stmt.setString(3, persona.getApellido());
			stmt.setDate(4, Date.valueOf(persona.getFechaNacimiento()));
			stmt.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}
	
	
	public void actualizarPersona(Persona persona) throws ErrorException {
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ?";
		try(Connection conn = abrirConexion(); 
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellido());
			stmt.setDate(3, Date.valueOf(persona.getFechaNacimiento()));
			stmt.setString(4, persona.getDni());
			stmt.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}
	
	public void borrarPersona(String dni) throws ErrorException {
		String sql = "DELETE FROM PERSONAS WHERE DNI = ?";
		try(Connection conn = abrirConexion(); 
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, dni);
			stmt.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}
	

}

