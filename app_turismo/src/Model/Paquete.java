package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
                                            //CREATE
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
	                                      //DELTE
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
	                                        //READ
	 public void Read (int codigoventa, JTextField iddestino ,JTextField idorigen ,JTextField fechaventa ,JTextField horaventa ,JTextField horasalida ,JTextField fechaejecucion,JTextField observacion,JTextField idpromotor,JTextField idcliente,JTextField idaperador,JTextField idmedio,JTextField precio,JTextField idvehiculo ) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "SELECT * FROM tblpaquetes WHERE codigoventa = ? ";
			
			try {
				dbConnection = connector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1, codigoventa);
				ResultSet rs = pst.executeQuery();
				
				while (rs.next()) {
					iddestino.setText(rs.getString(2));
					idorigen.setText(rs.getString(3));
					fechaventa.setText(rs.getString(4));
					horaventa.setText(rs.getString(5));
					horasalida.setText(rs.getString(6));
					fechaejecucion.setText(rs.getString(7));
					observacion.setText(rs.getString(8));
					idpromotor.setText(rs.getString(9));
					idcliente.setText(rs.getString(10));
					idaperador.setText(rs.getString(11));
					idmedio.setText(rs.getString(12));
					precio.setText(rs.getString(13));
					idvehiculo.setText(rs.getString(14));
				}
					
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());		
			}
			
				
	 }

		// UPDATE
		public void Update(int codigoventa,int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
				String fechaejecucion, String observacion, int idpromotor, int idcliente, int idaperador, int idmedio,
				String precio, String idvehiculo) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "UPDATE tblpaquetes SET  iddestino = ?,  idorigen = ?, fechaventa = ?, horaventa = ?, horasalida = ?, fechaejecucion = ?, observacion = ?,idpromotor = ?,idcliente = ?,idaperador = ?, idmedio = ? , precio = ?, idvehiculo = ? WHERE codigoventa = ?";

			try {
				dbConnection = connector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setInt(1, iddestino);
				pst.setInt(2, idorigen);
				pst.setString(3, fechaventa);
				pst.setString(4, horaventa);
				pst.setString(5, horasalida);
				pst.setString(6, fechaejecucion);
				pst.setString(7, observacion);
				pst.setInt(8, idpromotor);
				pst.setInt(9, idcliente);
				pst.setInt(10, idaperador);
				pst.setInt(11, idmedio);
				pst.setString(12, precio);
				pst.setString(13, idvehiculo);
				pst.setInt(14, codigoventa);
			

				pst.executeUpdate();
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea Actualizar el registro No. " + codigoventa + " ? ");

				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,
							"El Registro No. " + codigoventa + " Se a Actualizado Correctamente");
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
}
}
