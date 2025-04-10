package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tipomedios {
	 /*1 terrestre, 2 acuatico, 3 aereo, 4 alternativo */
	public String nombre;
	 public String obsevacion;
	public Tipomedios( String nombre, String obsevacion) {
		super();
	
		this.nombre = nombre;
		this.obsevacion = obsevacion;
	}
	
	public Tipomedios() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObsevacion() {
		return obsevacion;
	}
	public void setObsevacion(String obsevacion) {
		this.obsevacion = obsevacion;
	}

	Conexion conector = new Conexion();	
	
	public void create (String nombre, String obsevacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tbltipomedios (nombre,obsevacion) values (?,?)";
		
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
	 public void delete (int idtipomedios) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tbltipomedios WHERE idtipomedios = ? ";
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1,idtipomedios);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipomedios  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idtipomedios+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
	//READ
		 public void Read (int idtipomedios, JTextField nombre,JTextField observacion) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "SELECT * FROM tbltipomedios WHERE idtipomedios = ? ";
				
				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					pst.setInt(1, idtipomedios);
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
			public void Update(int idtipomedios, String nombre, String obsevacion) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
				String script = "UPDATE tbltipomedios SET nombre = ?, obsevacion = ? WHERE idtipomedios = ?";

				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					pst.setString(1, nombre);
					pst.setString(2, obsevacion);
					pst.setInt(3, idtipomedios);

					pst.executeUpdate();
					int resp = JOptionPane.showConfirmDialog(null,
							"¿Desea Actualizar el registro No. " + idtipomedios + " ? ");

					if (resp == JOptionPane.OK_OPTION) {
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null,
								"El Registro No. " + idtipomedios + " Se a Actualizado Correctamente");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
	 
}
