package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {

		// Update - Actualizar registros de una tabla

		Connection con = null;
		PreparedStatement ps = null;
		String query = "UPDATE CARRERAS SET NOMBRE=?, AREA=?, DURACION=?, PRESUPUESTO=? WHERE CARRERA_ID=?";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DanCeteq", "admin");
			ps = con.prepareStatement(query);

			// Establecemos los valores para ACTUALIZAR nuestro registro
			// pero las columnas van indicadas en el orden en la que aparecen en la
			// sentencia

			ps.setString(1, "EDUCADORA");
			ps.setString(2, "EDUCACION");
			ps.setString(3, "12 SEMESTRES");
			ps.setDouble(4, 12000.99);
			ps.setInt(5, 7);// El ID se envia al final como en la sentencia se indica
			// Una vez establecemos los valores, ejecutamos el INSERT
			int flag = ps.executeUpdate();

			if (flag == 1) {
				System.out.println("Carrera editada exitosamente");
			} else {
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
