package Controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public Connection conectarBD() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root", "2556229");
			System.out.println("Connected With The DatabasebSuccessfully");
		} catch (SQLException e) {
			System.out.println("Error While Connecting To The Database");
		}

		return connection;
	}

}
