package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Clientes {
	Conexion conector = new Conexion();	
	 public int id;
	public int tipodocumento; 
	public int documento;
	public String nombres;
	public String apeliidos;
	public String eps;
	public String alergias;
	public String fechanacimiento;
	public String correo;
	public String estadocivil;
	public String telefono;
	public Clientes(int id, int tipodocumento, int documento, String nombres, String apeliidos, String eps,
			String alergias, String fechanacimiento, String correo, String estadocivil, String telefono) {
		super();
		this.id = id;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apeliidos = apeliidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.correo = correo;
		this.estadocivil = estadocivil;
		this.telefono = telefono;
	}


	public Clientes() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	//CREATE
	public void create (int id, int tipodocumento, int documento, String nombres, String apeliidos, String eps,String alergias, String fechanacimiento, String correo, String estadocivil, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblclientes (id,tipodocumento,documento,nombres,apeliidos,eps,alergias,fechanacimiento,correo,estadocivil,telefono) values (?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setLong(1,id);
			pst.setLong(2,tipodocumento);
			pst.setLong(3,documento);
			pst.setString(4,nombres);
			pst.setString(5,apeliidos);
			pst.setString(6,eps);
			pst.setString(7,alergias);
			pst.setString(8,fechanacimiento);
			pst.setString(9,correo);
			pst.setString(10,estadocivil);
			pst.setString(11,telefono);
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		
		
	}
	//DELTE
	 public void delete (int id) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblclientes WHERE id = ? ";
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
	 public void Read (int id,JTextField tipodocumento,JTextField documento,JTextField nombres,JTextField apeliidos,JTextField eps,JTextField alergias,JTextField fechanacimiento,JTextField correo,JTextField estadocivil,JTextField telefono) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "SELECT * FROM tblclientes WHERE id = ? ";
			
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1,id);
				ResultSet rs = pst.executeQuery();
				
				while (rs.next()) {
					tipodocumento.setText(rs.getString(2));
					documento.setText(rs.getString(3));
					correo.setText(rs.getString(4));
					telefono.setText(rs.getString(5));
					nombres.setText(rs.getString(6));
					apeliidos.setText(rs.getString(7));
					eps.setText(rs.getString(8));
					alergias.setText(rs.getString(9));
					fechanacimiento.setText(rs.getString(10));
					correo.setText(rs.getString(11));
					estadocivil.setText(rs.getString(12));
					telefono.setText(rs.getString(13));
				}
					
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());		
			}
			
				
	 }

		                                                               // UPDATE
		public void Update(int id, int tipodocumento, int documento, String nombres, String apeliidos, String eps,String alergias, String fechanacimiento, String correo, String estadocivil, String telefono) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "UPDATE tblclientes SET  tipodocumento = ?,  documento = ?, nombres = ?, apeliidos = ?, eps = ?, alergias = ?, fechanacimiento = ?, correo = ?, estadocivil = ?, telefono = ? WHERE id = ?";

			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1, tipodocumento);
				pst.setInt(2, documento);
				pst.setString(3, nombres);
				pst.setString(4, apeliidos);
				pst.setString(5, eps);
				pst.setString(6, alergias);
				pst.setString(7, fechanacimiento);
				pst.setString(8, correo);
				pst.setString(9, estadocivil);
				pst.setString(10, telefono);
				pst.setInt(11, id);
				
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
