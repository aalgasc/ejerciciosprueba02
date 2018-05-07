import beans.Cliente;
import beans.Pedido;
import beans.Pedido;
public class TestPedido {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("B11111", "Computer Space");
		Cliente cli2 = new Cliente("C22222", "Computhiperglonalizanet");
		Cliente cli3 = new Cliente("D33333", "Monetes Graciosos S.A.");
		
		Pedido ped1 = new Pedido(1, "tornillo pavonado",0.5,cli1);
		Pedido ped2 = new Pedido(1, "tornillo pavonado",0.5,new Cliente("A224", "ABC", 1200,2));
		Pedido ped3 = new Pedido(999, "Grapadoras a cholon", 0, new Cliente("9999X", "DESGÜACES PALOMINO", 1800000, 12));
		
		
		
		
				
		
		Cliente micliente = ped2.getCliente();
		micliente.setRazonSocial("computer");
		
		System.out.println(ped2.getCliente().getRazonSocial());
		System.out.println(ped1.getCliente().getCif() +   " " + ped1.getDescripcion());
		System.out.println(ped3.getCliente().getRazonSocial() + " " + ped3.getDescripcion());
	}

}
