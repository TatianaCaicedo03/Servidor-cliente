package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	public void create (String nombre, String obsevacion) {
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
	
	 public void delete (int idtipo) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM tbltipotransporte WHERE idtipo = ? ";
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1,idtipo);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipo  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idtipo+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
}
