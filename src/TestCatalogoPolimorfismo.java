import beans.AlqCasa;
import beans.Cliente;
import beans.Pedido;
import negocio.CatalogoPedidos;

public class TestCatalogoPolimorfismo {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente("A33852","CSPACE", 30000000, 110);
		Pedido ped1, ped2, ped3, acasa1, acasa2, acasa3;
		
		
		
		
		ped1 = new Pedido(1, "ingletadora telescopica", 150,cli1);
		ped2 = new Pedido(2, "zapatillas de baile", 120,cli1);
		ped3 = new Pedido(3, "tornillo roscachapa 3/16", 2,cli1);
		acasa1 = new AlqCasa(4, "casa cadiz", 1200, cli1, 120, 4, 1600, 5);
		acasa2 = new AlqCasa(5, "casa madrid", 200, cli1, 90, 3, 1800, 4);
		acasa3 = new AlqCasa(6, "casa logroño", 800, cli1, 80, 3, 1300, 10);

		
		
		CatalogoPedidos micat= new CatalogoPedidos(10);
		
		micat.addPedido(ped1);
		micat.addPedido(ped2);
		micat.addPedido(ped3);
		micat.addPedido(acasa1);
		micat.addPedido(acasa2);
		micat.addPedido(acasa3);
		
		micat.listarPedidos();
		
		Pedido otro = micat.buscarPedido(1);
		
		if (otro instanceof AlqCasa)
			System.out.println((((AlqCasa) otro).getMetrosCuadrados()));
		else
			System.out.println(otro.getDescripcion());
		
		
		System.out.println("cif : " + otro.getCliente().getCif());
		
		Pedido pedido1, pedido2, pedido3, pedido4;
		
		pedido1 = new Pedido(7, "tornillo pavonado 4/35", 2,cli1);
		pedido2 = new AlqCasa(8, "casa tarradellas", 3000, cli1, 100, 2, 500, 6);
		
		micat.addPedido(pedido1);
		micat.addPedido(pedido2);
		micat.listarPedidos();

	}

}
