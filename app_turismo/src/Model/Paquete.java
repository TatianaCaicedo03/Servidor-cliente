package Model;

public class Paquete {
	public int codigoventa;
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
	public Paquete(int codigoventa, int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int idpromotor, int idcliente, int idaperador, int idmedio,
			String precio, String idvehiculo) {
		super();
		this.codigoventa = codigoventa;
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
	public int getCodigoventa() {
		return codigoventa;
	}
	public void setCodigoventa(int codigoventa) {
		this.codigoventa = codigoventa;
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
	
}
