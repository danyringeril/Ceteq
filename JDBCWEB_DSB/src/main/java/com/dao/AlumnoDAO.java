package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Database;
import com.general.IMetodos;

public class AlumnoDAO implements IMetodos {

	// Esta clase es la clase encargada de la logica y de la
	// transformacion de la informacion
	// Traemos a las interfaces que utilizamos para los metodos
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	// Creamos una instancia de Database para iniciar la conexion a BD cada metodo
	Database db = new Database();

	// Creamos un nuevo alumno nulo para poder manipularlo posteriormente
	Alumno a = null;
	// Declaramos un String para responder con los metodos que devuelven String,
	// para cambiarle el valor a "1" o "0" dependiendo si se ejecuta o no el metodo
	String resultado = null;

//----------------------------------------------------------------------------------------------

	@Override
	public String guardar(Object ob) {

		a = (Alumno) ob; // Se castea o se pasa el valor del objeto a guardar en la BD,
		// en este caso un Alumno

		String query = "INSERT INTO ALUMNOS VALUES (?,?,?,?,?,?,?)";

		try {
			Class.forName(db.getDriver()); // recuperamos el String con la ingo de la
			// clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			// Establecemos los valores de nuestro alumno a guardar
			ps.setInt(1, 1);
			ps.setString(2, a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getGenero());
			ps.setString(5, a.getGrado());
			ps.setString(6, a.getCiudad());
			ps.setInt(7, 1); // cada alumno nuevo, lo creamos con status 1

			int flag = ps.executeUpdate(); // se ejecuta la sentencia SQL

			if (flag == 1) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}

		return resultado;
	}

//-------------------------------------------------------------------------------------	

	@Override
	public String editar(Object ob) {
		a = (Alumno) ob; // Se castea o se pasa el valor del objeto a guardar en la BD,
		// en este caso un Alumno

		String query = "UPDATE ALUMNOS SET NOMBRE=?, FECHANAC=?, " + "GENERO=?, GRADO=?, CIUDAD=? WHERE ALUMNO_ID=?";

		try {
			Class.forName(db.getDriver()); // recuperamos el String con la ingo de la
			// clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			// Establecemos los valores de nuestro alumno a editar
			// ps.setInt(1, 1);
			ps.setString(1, a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getGenero());
			ps.setString(4, a.getGrado());
			ps.setString(5, a.getCiudad());
			ps.setInt(6, a.getAlumnoId()); // enviamos desde la web el id del alumno
			// a editar su info

			int flag = ps.executeUpdate(); // se ejecuta la sentencia SQL

			if (flag == 1) {
				resultado = "1";
				System.out.println("Se ha editado correctamente el alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}

		return resultado;
	}

//-------------------------------------------------------------------------------------------	

	@Override
	public String eliminar(int id) {

		// Esta sentencia se completa o contatena con el id que enviemos desde la web
		String query = "DELETE FROM ALUMNOS WHERE ALUMNO_ID=" + id;

		try {
			Class.forName(db.getDriver()); // recuperamos el String con la ingo de la
			// clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			int flag = ps.executeUpdate(); // se ejecuta la sentencia SQL

			if (flag == 1) {
				resultado = "1";
				System.out.println("Se ha eliminado correctamente el alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}

		return resultado;

	}

//--------------------------------------------------------------------------------------------	

	@Override
	public Object buscar(int id) {

		String query = "SELECT * FROM ALUMNOS WHERE ALUMNO_ID=" + id;

		try {
			Class.forName(db.getDriver()); // recuperamos el String con la ingo de la clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();// la info de la BD la recuperamos aqui en rsa travez de
			// ResultSet

			// La info que recuperamos de nuestro alumno en result set la llevamos ahora
			// hacia un
			// objeto alumno , porque es lo que debemos devolver

			while (rs.next()) {// La info de result set la pasamos para crear un nuevo alumno
				// o guardar la info en un nuevo alumno
				a = new Alumno(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Retornamos la info del alumno que hallamos en la BD
		return a;
	}

//------------------------------------------------------------------------------------------	

	@Override
	public List mostrar() {

		String query = "SELECT * FROM ALUMNOS";
		// Como vamos a devolver la info de todos los registros de los alumnos
		// Necesitamos una lista en donde agregarlos
		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			Class.forName(db.getDriver()); // recuperamos el String con la ingo de la clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();// la info de la BD la recuperamos aqui en rsa travez de
			// ResultSet

			// La info que recuperamos de nuestro alumno en result set la llevamos ahora
			// hacia un
			// objeto alumno , porque es lo que debemos devolver

			while (rs.next()) {// La info de result set la pasamos para crear un nuevo alumno
				// o guardar la info en un nuevo alumno
				a = new Alumno(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
				// Ahora cada que se crea o recupera un nuevo alumno, hay que agregarlo a la
				// lista
				alumnos.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Retornamos la info del alumno que hallamos en la BD

		return alumnos;

	}

	public List detalles() {

		String query = "SELECT A.ALUMNO_ID AS MATRICULA, A.NOMBRE AS ALUMNO, C.NOMBRE AS CARRERA, C.AREA FROM ALUMNOS A "
				+ "INNER JOIN CARRERA_ALUMNOS CA " + "ON A.ALUMNO_ID=CA.ALUMNO_ID " + "INNER JOIN CARRERAS C "
				+ "ON C.CARRERA_ID=CA.CARRERA_ID";

		List<ObjetoDTO> detalles = new ArrayList<ObjetoDTO>();

		ObjetoDTO fila = null;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				fila = new ObjetoDTO(rs.getInt("MATRICULA"), rs.getString("ALUMNO"), rs.getString("CARRERA"));
				detalles.add(fila);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return detalles;

	}

}
