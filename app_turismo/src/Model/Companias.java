package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Companias {

	Conexion connector = new Conexion();
	public String razonsocial;
	public String direccion;
	public String correo;
	public String telefono;
	public String fechacreacion;
	public String web;

	public Companias(String razonsocial, String direccion, String correo, String telefono, String fechacreacion,
			String web) {
		super();
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.web = web;
	}

	public Companias() {
		// TODO Auto-generated constructor stub
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	                                                   // CREATE
	public void create(String razonsocial, String direccion, String correo, String telefono, String fechacreacion,
			String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblcompanias (razonsocial,direccion,correo,telefono,fechacreacion, web) values (?,?,?,?,?,?)";

		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	                                                       // DELETE
	public void delete(int idcompañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblcompanias WHERE idcompañia = ? ";
		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idcompañia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompañia + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idcompañia + " Eliminado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	                                                          // READ
	public void Read(int idcompañia, JTextField razonsocial, JTextField direccion, JTextField correo,
			JTextField telefono, JTextField fechacreacion, JTextField web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tblcompanias WHERE idcompañia = ? ";

		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setInt(1, idcompañia);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				razonsocial.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correo.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	                                                             //UPDATE
	public void Update (int idcompañia,String razonsocial, String direccion, String correo, String telefono, String fechacreacion,String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
        String script ="UPDATE tblcompanias SET  razonsocial = ?,  direccion = ?, correo = ?, telefono = ?, fechacreacion = ?, web = ? WHERE idcompañia = ?";

		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.setInt(7,idcompañia);
			
			pst.executeUpdate();
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea Actualizar el registro No. " + idcompañia + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "El Registro No. " + idcompañia + " Se a Actualizado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
