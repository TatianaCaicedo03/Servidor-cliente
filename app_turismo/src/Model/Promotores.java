package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

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
    Conexion conector = new Conexion ();
	
    public void  Create(int id, int tipodocumento, int documento, String nombres, String apeliidos, String direccion,String correopersonal, String correocorp, String fechanacimiento, String telefono, int idagencia) {
    	Connection dbConnection = null;
    	PreparedStatement pst = null;
		String script = "INSERT INTO tblpromotores ( id,tipodocumento,documento,nombres,apeliidos, direccion,correopersonal,correocorp,fechanacimiento,telefono,idagencia) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setFloat(1,id);
			pst.setFloat(2,tipodocumento);
			pst.setLong(3,documento);
			pst.setString(4,nombres);
			pst.setString(5,apeliidos);
			pst.setString(6,direccion);
			pst.setString(7,correopersonal);
			pst.setString(8,correocorp);
			pst.setString(9,fechanacimiento);
			pst.setString(10,telefono);
			pst.setFloat(11,idagencia);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
    }
	
	
}
