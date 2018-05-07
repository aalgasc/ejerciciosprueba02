import beans.AlqCasa;
import beans.Cliente;
import beans.Pedido;
import negocio.CatalogoPedidos;

public class TestCatalogo1 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("A33852","CSPACE", 30000000, 110);
		Pedido ped1, ped2, ped3, ped4, ped5, ped6, ped7;
		
		
		
		
		ped1 = new Pedido(1, "ingletadora telescopica", 150,cli1);
		ped2 = new Pedido(2, "zapatillas de baile", 120,cli1);
		ped3 = new Pedido(3, "tornillo roscachapa 3/16", 2,cli1);
		ped4 = new AlqCasa(4, "casa cadiz", 1200, cli1, 120, 4, 1600, 5);
		ped5 = new AlqCasa(5, "casa madrid", 200, cli1, 90, 3, 1800, 4);
		ped6 = new AlqCasa(6, "casa logroño", 800, cli1, 80, 3, 1300, 10);
		ped7 = new AlqCasa(7, "casa valencia", 900, cli1, 40, 1, 600, 3);
		
		
		CatalogoPedidos micat= new CatalogoPedidos();
		
		micat.addPedido(ped1);
		micat.addPedido(ped2);
		micat.addPedido(ped4);
		micat.addPedido(ped5);
		micat.addPedido(ped6);
		
		
		micat.listarPedidos();
		System.out.println("=======BUSCAR PEDIDO==========");
		Pedido ped8 = micat.buscarPedido(5);
		if (ped8 != null)
			System.out.println("pedido : " + ped8.getDescripcion());
		else
			System.out.println("PEDIDO NO ENCONTRADO");

		

		
	}

}
