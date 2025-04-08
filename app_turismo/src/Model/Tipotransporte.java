package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tipotransporte {

	public String nombre;
	public String observacion;

	public Tipotransporte(String nombre, String observacion) {
		super();

		this.nombre = nombre;
		this.observacion = observacion;
	}

	public Tipotransporte() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	Conexion conector = new Conexion();

	public void create(String nombre, String obsevacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tbltipotransporte (nombre,observacion) values (?,?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, obsevacion);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	public void delete(int idtipo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tbltipotransporte WHERE idtipo = ? ";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idtipo);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipo + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idtipo + " Eliminado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// READ
	public void Read(int idtipo, JTextField nombre, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tbltipotransporte WHERE idtipo = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setInt(1, idtipo);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	                                                                     // UPDATE
			public void Update(int idtipo,String nombre, String obsevacion) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
				String script = "UPDATE tbltipotransporte SET nombre = ?, observacion = ? WHERE idtipo = ?";

				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					pst.setString(1, nombre);
					pst.setString(2, obsevacion);
					pst.setInt(3, idtipo);
					
					pst.executeUpdate();
					int resp = JOptionPane.showConfirmDialog(null,
							"¿Desea Actualizar el registro No. " + idtipo + " ? ");

					if (resp == JOptionPane.OK_OPTION) {
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null,
								"El Registro No. " + idtipo + " Se a Actualizado Correctamente");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}

}
