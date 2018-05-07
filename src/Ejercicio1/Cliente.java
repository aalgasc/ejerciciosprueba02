package Ejercicio1;

public class Cliente {
	
	private int id;
	private String descripcion;

	



	public Cliente(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "ID: "+id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cliente) {
			Cliente cliente= (Cliente) obj;
			return cliente.getId()==id;
		}else
			return false;
	}
}
