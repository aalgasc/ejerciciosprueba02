package beans;

public class Proyecto {
	private int idProyecto;
	private String descripcion;
	private Factura factura;
	private Empleado[] empleados;
	private Empleado jefe;
	private Pedido pedido;
	
	
	public Proyecto(int idProyecto, String descripcion, Factura factura, Empleado[] empleados, Empleado jefe,
			Pedido pedido) {
		super();
		this.idProyecto = idProyecto;
		this.descripcion = descripcion;
		this.factura = factura;
		this.empleados = empleados;
		this.jefe = jefe;
		this.pedido = pedido;
	}


	public int getIdProyecto() {
		return idProyecto;
	}


	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public Empleado[] getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}


	public Empleado getJefe() {
		return jefe;
	}


	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	
	
	
}
