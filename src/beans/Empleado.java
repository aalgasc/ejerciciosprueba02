package beans;

public class Empleado {

	private int idEmpleado;
	private String nombre;
	private double sueldo;
	private double comision;

	public Empleado(int idEmpleado, String nombre, double sueldo, double comision) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.comision = comision;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}
