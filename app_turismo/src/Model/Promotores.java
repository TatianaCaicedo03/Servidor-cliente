package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;
import View.frm_GUIPromotor;

public class Promotores {
	public int id;
	public int tipodocumento;
	public int documento;
	public String nombres;
	public String apeliidos;
	public String direccion;
	public String correopersonal;
	public String correocorp;
	public String fechanacimiento;
	public String telefono;
	public int idagencia;
	public String contrasena;
	Conexion conector = new Conexion();
	

	public Promotores(int id, int tipodocumento, int documento, String nombres, String apeliidos, String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono, int idagencia) {
		super();
		this.id = id;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apeliidos = apeliidos;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.idagencia = idagencia;

	}

	
	  public Promotores(String contrasena) { super(); this.contrasena = contrasena;
	  }
	  
	  public String getContrasena() { return contrasena; }
	 
	  public void setContrasena(String contrasena) { this.contrasena = contrasena;
	  }
	 

	public Promotores() {
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreopersonal() {
		return correopersonal;
	}

	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}

	public String getCorreocorp() {
		return correocorp;
	}

	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	                                                                // CREATE
	public void Create(int id, int tipodocumento, int documento, String nombres, String apeliidos, String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono, int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblpromotores ( id,tipodocumento,documento,nombres,apeliidos, direccion,correopersonal,correocorp,fechanacimiento,telefono,idagencia) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setFloat(1, id);
			pst.setFloat(2, tipodocumento);
			pst.setLong(3, documento);
			pst.setString(4, nombres);
			pst.setString(5, apeliidos);
			pst.setString(6, direccion);
			pst.setString(7, correopersonal);
			pst.setString(8, correocorp);
			pst.setString(9, fechanacimiento);
			pst.setString(10, telefono);
			pst.setFloat(11, idagencia);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	                                                                  // DELETE
	public void delete(int id) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblpromotores WHERE id = ? ";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, id);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id + " Eliminado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	                                                                // READ
	public void Read(int id, JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apeliidos,
			JTextField direccion, JTextField correopersonal, JTextField correocorp, JTextField fechanacimiento,
			JTextField telefono, JTextField idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tblpromotores WHERE id = ? ";


		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				apeliidos.setText(rs.getString(6));
				direccion.setText(rs.getString(7));
				correopersonal.setText(rs.getString(8));
				correocorp.setText(rs.getString(9));
				fechanacimiento.setText(rs.getString(10));
				telefono.setText(rs.getString(11));
				idagencia.setText(rs.getString(12));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	                                                               // UPDATE
	public void Update(int id, int tipodocumento, int documento, String nombres, String apeliidos, String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono, int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "UPDATE tblpromotores SET  tipodocumento = ?,  documento = ?, nombres = ?, apeliidos = ?, direccion = ?, correopersonal = ?, correocorp = ?, fechanacimiento = ?, telefono = ?, idagencia = ?   WHERE id = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apeliidos);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorp);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setInt(10, idagencia);
			pst.setInt(11, id);

			pst.executeUpdate();
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea Actualizar el registro No. " + id + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "El Registro No. " + id + " Se a Actualizado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
                                                                        //ACCESO
	public void Control_Acceso (int documento, String Contrasena) {
		frm_GUIPromotor principal = new frm_GUIPromotor();
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String scrip = "SELECT * FROM tblpromotores WHERE documento = ? AND contrasena = ? ";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(scrip);
			pst.setInt(1, documento);
			pst.setString(2, contrasena);
			ResultSet rs = pst.executeQuery();
			int continuar = JOptionPane.showConfirmDialog(null,"¿DESEA INICIAR SECCION?");
			
			if (continuar == JOptionPane.OK_OPTION) {
				while (rs.next()) {
					principal.show();
					JOptionPane.showMessageDialog(null, "¡ACCESO PERMITIDO!");
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
			// TODO: handle exception
		}
		
		
	}
	

	
}
