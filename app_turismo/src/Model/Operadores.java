package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operadores {

	public int tipodocumento;
	public int documento;
	public String nombres;
	public String apeliidos;
	public String direccion;
	public String correo;
	public String telefono;
	public String idmatricula;
	public Operadores( int tipodocumento, int documento, String nombres, String apeliidos, String direccion,
			String correo, String telefono, String idmatricula) {
		super();
		
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apeliidos = apeliidos;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.idmatricula = idmatricula;
	}
	
	public Operadores() {
		// TODO Auto-generated constructor stub
	}

	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApeliidos() {
		return apeliidos;
	}
	public void setApeliidos(String apeliidos) {
		this.apeliidos = apeliidos;
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
	public String getIdmatricula() {
		return idmatricula;
	}
	public void setIdmatricula(String idmatricula) {
		this.idmatricula = idmatricula;
	}
	
	Conexion conector = new Conexion();	
	public void create (int tipodocumento,int documento, String nombres, String apeliidos, String direccion,
			String correo, String telefono, String idmatricula) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tbloperadores (tipodocumento,documento, nombres, apeliidos, direccion, correo,telefono,idmatricula) values (?,?,?,?,?,?,?,?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setLong(1, tipodocumento);
			pst.setLong(2, documento);
			pst.setString(3,nombres );
			pst.setString(4,apeliidos );
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setString(8, idmatricula);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}