package Ejercicio1;

public class Pedido {
	
	private int id;
	private String descripcion ;
	private Cliente cliente;


	

	public Pedido(int id, String descripcion, Cliente cliente) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cliente = cliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pedido) {
			Pedido pedido= (Pedido) obj;
			return pedido.getId()==id;
		}else
			return false;
	}

	@Override
	public String toString() {
		
		return "ID: "+id+" [Cliente: "+cliente+"]";
	}
}
