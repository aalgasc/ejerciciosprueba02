package beans;
public abstract class Pedido {
	protected int idPedido;
	protected String descripcion;
	protected double importe;
	protected Cliente cliente;
	
	
	
	//constructores

	
	
	public Pedido(int idPedido, String descripcion, double importe, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.descripcion = descripcion;
		this.importe = importe;
		this.cliente = cliente;
	}
	
	




	public Pedido(int idPedido, String descripcion) {
		super();
		this.idPedido = idPedido;
		this.descripcion = descripcion;
	}




	public Pedido() {
		super();
	}






	public int getIdPedido() {
		return idPedido;
	}
	
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPedido;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (idPedido != other.idPedido)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descripcion=" + descripcion + ", importe=" + importe + ", cliente="
				+ cliente.getCif() + "]";
	}
	
	
	public abstract void mostrarPedido();
	public abstract double calcularImporte();
	public abstract double importeConIva(int iva);
	
//		{	
//		System.out.print("numero de pedido : " + idPedido);
//		System.out.print("\tdescripcion : " + descripcion);
//		System.out.print("\timporte : " + importe);
//		System.out.println("\tcliente : " + getCliente().getRazonSocial());
//		}
		
	
	
	
}
