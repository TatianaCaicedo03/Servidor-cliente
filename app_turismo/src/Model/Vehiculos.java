package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Vehiculos {
	public String matricula;
	public String marca; 
	public int puestos;
	public String modelo;
	public int numeromotor;
	public String categoria; 
	public int idtipo;
	public Vehiculos(String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria,
			int idtipo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
		this.idtipo = idtipo;
	}
	public Vehiculos() {
		// TODO Auto-generated constructor stub
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	
	Conexion conector = new Conexion ();
	//CREATE
	public void create (String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria,int idtipo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblvehiculos (matricula,marca,puestos,modelo,numeromotor,categoria,idtipo) values (?,?,?,?,?,?,?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1,matricula);
			pst.setString(2,marca);
			pst.setLong(3,puestos);
			pst.setString(4,modelo);
			pst.setLong(5,numeromotor);
			pst.setString(6,categoria);
			pst.setLong(7,idtipo);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}
	//DELTE
	 public void delete (String matricula) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblvehiculos WHERE   matricula = ? ";
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1,matricula);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + matricula  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+matricula+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
	//READ
	 public void Read (String matricula, JTextField marca,JTextField puestos,JTextField modelo,JTextField numeromotor,JTextField categoria,JTextField idtipo) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "SELECT * FROM tblvehiculos WHERE matricula = ? ";
			
			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setString(1, matricula);
				ResultSet rs = pst.executeQuery();
				
				while (rs.next()) {
					marca.setText(rs.getString(2));
					puestos.setText(rs.getString(3));
					modelo.setText(rs.getString(4));
					numeromotor.setText(rs.getString(5));
					categoria.setText(rs.getString(6));
					idtipo.setText(rs.getString(7));
					
				}
					
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());		
			}
			
				
	 }
	 
		                                                        // UPDATE
		public void Update(String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria,int idtipo) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "UPDATE tblvehiculos SET  marca = ?,  puestos = ?, modelo = ?, numeromotor = ?, categoria = ?, idtipo = ? WHERE matricula = ?";

			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				pst.setString(1, marca);
				pst.setInt(2, puestos);
				pst.setString(3, modelo);
				pst.setInt(4, numeromotor);
				pst.setString(5, categoria);
				pst.setInt(6, idtipo);
				pst.setString(7, matricula);

				pst.executeUpdate();
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea Actualizar el registro No. " + matricula + " ? ");

				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,
							"El Registro No. " + matricula + " Se a Actualizado Correctamente");
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
