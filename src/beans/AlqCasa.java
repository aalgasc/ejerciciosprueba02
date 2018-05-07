package beans;

public class AlqCasa extends Pedido {
	
	private int metrosCuadrados, numHabitaciones;
	private double preciosSemana;
	private int semanas;
	public AlqCasa(int idPedido, String descripcion, double importe, Cliente cliente, int metrosCuadrados,
			int numHabitaciones, double preciosSemana, int semanas) {
		super(idPedido, descripcion, importe, cliente);
		this.metrosCuadrados = metrosCuadrados;
		this.numHabitaciones = numHabitaciones;
		this.preciosSemana = preciosSemana;
		this.semanas = semanas;
	}
	
	public AlqCasa() {
		super();
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getPreciosSemana() {
		return preciosSemana;
	}

	public void setPreciosSemana(double preciosSemana) {
		this.preciosSemana = preciosSemana;
	}

	public int getSemanas() {
		return semanas;
	}

	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}

	@Override
	public String toString() {
		return "AlqCasa [metrosCuadrados=" + metrosCuadrados + ", numHabitaciones=" + numHabitaciones
				+ ", preciosSemana=" + preciosSemana + ", semanas=" + semanas + ", idPedido=" + idPedido
				+ ", descripcion=" + descripcion + "]";
	}

	@Override
	public void mostrarPedido() {
		System.out.print("numero de pedido : " + idPedido);
		System.out.print("\tdescripcion : " + descripcion);
		System.out.print("\tcliente : " + getCliente().getCif());
		System.out.print("\tmetros : " + metrosCuadrados);
		System.out.print("\thabitac : " + numHabitaciones);
		System.out.println("\tcliente : " + preciosSemana);
	}

	@Override
	public double calcularImporte() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double importeConIva(int iva) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
