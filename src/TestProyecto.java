import beans.Cliente;
import beans.Empleado;
import beans.Factura;
import beans.Pedido;
import beans.Proyecto;

public class TestProyecto {

	public static void main(String[] args) {
		
		Empleado[] empleados=new Empleado[3];
		
		empleados[0]=new Empleado(1, "Pepe", 23000, 2499);
		empleados[1]=new Empleado(2, "Raul", 21300, 2299);
		empleados[2]=new Empleado(3, "Chendo", 16000, 1499);
		
		Factura factura=new Factura(38229, "pedido para mi casa", 80000);
		
		Empleado jefe=empleados[2];
		
		Cliente cliente=new Cliente("22942X", "real madrid");
		
		Pedido pedido=new Pedido(69, "clavos ardiendo", 20000, cliente);
		
		
		Proyecto proyecto=new Proyecto(1, "pedidio inicial", factura, empleados, jefe, pedido);
		
		Factura f =proyecto.getFactura();
		
		
		
		System.out.println(proyecto.getFactura().getIdfacura());
		
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado.getNombre());
			
		}
		
		System.out.println(proyecto.getPedido().getCliente());
		System.out.println("el jefe es " + jefe.getNombre() + " y cobra unos " + jefe.getSueldo() + "€ b/a");
	}

}
