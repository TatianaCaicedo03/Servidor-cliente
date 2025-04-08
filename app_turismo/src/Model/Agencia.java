package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Agencia {
	Conexion connector = new Conexion(); 
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
	
	                                                            //CREATE
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
	                                                               //DELETE
	public void delete (int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblagencias WHERE idagencia = ? ";
		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1,idagencia);
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idagencia  +" ? ");
			
			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"Registro No. "+idagencia+" Eliminado Correctamente");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());		}
	}
	
	                                                                 //READ
	 public void Read (int idagencia, JTextField nombre ,JTextField dirreccion ,JTextField correo ,JTextField telefono ,JTextField web ,JTextField idcampania ) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "SELECT * FROM tblagencias WHERE  idagencia = ? ";
			
			try {
				dbConnection = connector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1,idagencia);
				ResultSet rs = pst.executeQuery();
				
				while (rs.next()) {
					nombre.setText(rs.getString(2));
					dirreccion.setText(rs.getString(3));
					correo.setText(rs.getString(4));
					telefono.setText(rs.getString(5));
					web.setText(rs.getString(6));
					idcampania.setText(rs.getString(7));
					
				}
					
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());		
			}
	 }
	                                                                  //UPDATE
			public void Update (int idagencia,String nombre, String dirreccion, String correo, int telefono, String web,int idcampania) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
		        String script ="UPDATE tblagencias SET  nombre = ?,  dirreccion = ?, correo = ?, telefono = ?, web = ?, idcampania = ? WHERE idagencia = ?";

				try {
					dbConnection = connector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					pst.setString(1, nombre);
					pst.setString(2, dirreccion);
					pst.setString(3, correo);
					pst.setInt(4, telefono);
					pst.setString(5, web);
					pst.setInt(6, idcampania);
					pst.setInt(7,idagencia);
					pst.executeUpdate();
					int resp = JOptionPane.showConfirmDialog(null, "¿Desea Actualizar el registro No. " + idagencia + " ? ");

					if (resp == JOptionPane.OK_OPTION) {
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null, "El Registro No. " + idagencia + " Se a Actualizado Correctamente");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}

	
	
}
