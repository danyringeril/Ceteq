package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {

		// Create - Insertar registros (INSERT)

		Connection con = null;
		PreparedStatement ps = null;
		String query = "INSERT INTO CARRERAS VALUES (?,?,?,?,?)";
		// Para hacer una insercion, solo indicamos con signos de ? las columnas
		// a insertarse

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DanCeteq", "admin");
			ps = con.prepareStatement(query);

			// Establecemos los valores para crear nuestro nuevo registro
			ps.setInt(1, 1); // en esta linea se inserta el id y lo hace el disparador
			ps.setString(2, "DOCTOR");
			ps.setString(3, "SALUD");
			ps.setString(4, "9 SEMESTRES");
			ps.setDouble(5, 11000.9);

			// Una vez establecemos los valores, ejecutamos el INSERT
			int flag = ps.executeUpdate();

			if (flag == 1) {
				System.out.println("Carrera guardada exitosamente");
			} else {
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
