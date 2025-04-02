package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Medios {
	public String nombre;
	public String observacion;
	public int idtiposmedios;
	public Medios(String nombre, String observacion, int idtiposmedios) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
		this.idtiposmedios = idtiposmedios;
	}
	public Medios() {
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
	public int getIdtiposmedios() {
		return idtiposmedios;
	}
	public void setIdtiposmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
	}
	Conexion connector = new Conexion ();
	
	public void create (String nombre, String observacion, int idtiposmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblmedios(nombre,observacion,idtiposmedios) values (?,?,?)";

		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1,nombre);
			pst.setString(2,observacion);
			pst.setLong(3,idtiposmedios);
		
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}
	 public void delete (int idmedios) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblmedios WHERE idmedios = ? ";
			try {
				dbConnection = connector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1,idmedios);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedios  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idmedios+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
}
