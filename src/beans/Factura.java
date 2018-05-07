package beans;

public class Factura {
	private int idfacura;
	private String descripcion;
	private double importetotal;
	
	
	public Factura(int idfacura, String descripcion, double importetotal) {
		super();
		this.idfacura = idfacura;
		this.descripcion = descripcion;
		this.importetotal = importetotal;
	}
	public int getIdfacura() {
		return idfacura;
	}
	public void setIdfacura(int idfacura) {
		this.idfacura = idfacura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImportetotal() {
		return importetotal;
	}
	public void setImportetotal(double importetotal) {
		this.importetotal = importetotal;
	}

}
