package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	//CREATE
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
	//DELETE
	 public void delete (int id) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tbloperadores WHERE id = ? ";
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1,id);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+id+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
	//READ
	 public void Read (int id, JTextField tipodocumento,JTextField documento, JTextField nombres,JTextField  apeliidos,JTextField  direccion,JTextField  correo,JTextField telefono,JTextField idmatricula) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "SELECT * FROM tbloperadores WHERE id = ? ";
			
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				
				while (rs.next()) {
					tipodocumento.setText(rs.getString(2));
					documento.setText(rs.getString(3));
					nombres.setText(rs.getString(4));
					apeliidos.setText(rs.getString(5));
					direccion.setText(rs.getString(6));
					correo.setText(rs.getString(7));
					telefono.setText(rs.getString(8));
					idmatricula.setText(rs.getString(9));
				}
					
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());		
			}
			
				
	 }
	 
		                                                   // UPDATE
		public void Update(int id, int tipodocumento,int documento, String nombres, String apeliidos, String direccion,
				String correo, String telefono, String idmatricula) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "UPDATE tbloperadores SET  tipodocumento = ?,  documento = ?, nombres = ?, apeliidos = ?, direccion = ?, correo = ?, telefono = ?, idmatricula = ?  WHERE id = ?";

			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setLong(1, tipodocumento);
				pst.setLong(2, documento);
				pst.setString(3, nombres);
				pst.setString(4, apeliidos);
				pst.setString(5, direccion);
				pst.setString(6, correo);
				pst.setString(7, telefono);
				pst.setString(8, idmatricula);
				pst.setInt(9, id);

				pst.executeUpdate();
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea Actualizar el registro No. " + id + " ? ");

				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,
							"El Registro No. " + id + " Se a Actualizado Correctamente");
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}