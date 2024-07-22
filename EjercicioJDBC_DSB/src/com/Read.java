package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {

		/*
		 * READ - JDBC - Consultar datos Consultar nuestra tabla CARRERAS
		 */

		Connection con = null; // conexion a BD
		PreparedStatement ps = null; // entrada de datos de una sentencia SQL precompilada
		ResultSet rs = null; // salida de datos
		String query = "SELECT * FROM CARRERAS";

		try { // intentar ejecutar el sig bloque de codigo
				// Buscamos la clase OracleDriver dentro de un pkg
			Class.forName("oracle.jdbc.OracleDriver");
			// inicializamos nuestra conexion a BD
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DanCeteq", "admin");
			// Pasamos el valor de la conexion a BD a ps
			// al igual que la consulta
			ps = con.prepareStatement(query);// se precompila la sentencia SQL
			rs = ps.executeQuery(); // se ejecuta y se recupera la info de BD

			while (rs.next()) {// Mientras existan registros por leer
				System.out.println(rs.getInt("CARRERA_ID") + ":" + rs.getString("NOMBRE") + ":" + rs.getString("AREA")
						+ ":" + rs.getString("DURACION") + ":" + rs.getDouble("PRESUPUESTO"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
