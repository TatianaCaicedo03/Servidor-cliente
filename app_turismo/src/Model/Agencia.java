package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Agencia {

	public String nombre;
	public String dirreccion;
	public String correo;
	public int telefono;
	public String web;
	public int idcampania;
	public Agencia( String nombre, String dirreccion, String correo, int telefono, String web,
			int idcampania) {
		super();
	
		this.nombre = nombre;
		this.dirreccion = dirreccion;
		this.correo = correo;
		this.telefono = telefono;
		this.web = web;
		this.idcampania = idcampania;
	}
	


	public Agencia() {
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirreccion() {
		return dirreccion;
	}
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcampania() {
		return idcampania;
	}
	public void setIdcampania(int idcampania) {
		this.idcampania = idcampania;
	}
	Conexion connector = new Conexion(); 
	
	public void create (String nombre, String dirreccion, String correo, int telefono, String web,int idcampania) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblagencias (nombre, dirreccion,correo,telefono, web, idcampania) values (?,?,?,?,?,?)";
		try {dbConnection = connector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		pst.setString(1,nombre);
		pst.setString(2,dirreccion);
		pst.setString(3,correo);
		pst.setLong(4,telefono);
		pst.setString(5,web);
		pst.setLong(6,idcampania);
		pst.executeUpdate();
		JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
