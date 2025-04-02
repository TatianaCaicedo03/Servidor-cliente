package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Paquete {
	public int iddestino;
	public int idorigen;
	public String fechaventa;
	public String horaventa;
	public String horasalida;
	public String fechaejecucion;
	public String observacion;
	public int idpromotor;
	public int idcliente;
	public int idaperador;
	public int idmedio;
	public String precio;
	public String idvehiculo;
	Conexion connector = new Conexion ();
	
	public Paquete(int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int idpromotor, int idcliente, int idaperador, int idmedio,
			String precio, String idvehiculo) {
		super();
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.horasalida = horasalida;
		this.fechaejecucion = fechaejecucion;
		this.observacion = observacion;
		this.idpromotor = idpromotor;
		this.idcliente = idcliente;
		this.idaperador = idaperador;
		this.idmedio = idmedio;
		this.precio = precio;
		this.idvehiculo = idvehiculo;
	}


	public Paquete() {
		// TODO Auto-generated constructor stub
	}


	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdaperador() {
		return idaperador;
	}
	public void setIdaperador(int idaperador) {
		this.idaperador = idaperador;
	}
	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(String idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public void create (int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
String fechaejecucion, String observacion, int idpromotor, int idcliente, int idaperador, int idmedio,
			String precio, String idvehiculo){
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblpaquetes (iddestino,idorigen,fechaventa,horaventa,horasalida,fechaejecucion,observacion,idpromotor,idcliente,idaperador,idmedio,precio,idvehiculo) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setLong(1,iddestino);
			pst.setLong(2,idorigen);
			pst.setString(3,fechaventa);
			pst.setString(4,horaventa);
			pst.setString(5,horasalida);
			pst.setString(6,fechaejecucion);
			pst.setString(7,observacion);
			pst.setLong(8,idpromotor);
			pst.setLong(9,idcliente);
			pst.setLong(10,idaperador);
			pst.setLong(11,idmedio);
			pst.setString(12,precio);
			pst.setString(13,idvehiculo);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void delete (int codigoventa) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblpaquetes WHERE codigoventa = ? ";
		try {
			dbConnection = connector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1,codigoventa);
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigoventa  +" ? ");
			
			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"Registro No. "+codigoventa+" Eliminado Correctamente");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());		}
	}
	
}
