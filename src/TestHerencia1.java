import beans.AlqCasa;
import beans.Cliente;
import beans.Pedido;

public class TestHerencia1 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("B11111", "Computer Space");
		Pedido ped1 = new Pedido(2, "tornillos pavonados", 0.5, cli1);
		AlqCasa acasa1 = new AlqCasa(2, "casa en Cadiz 200", 6000, cli1, 120, 5, 1200, 5);
		
		
		ped1.mostrarPedido();
		acasa1.mostrarPedido();
		System.out.println("=======================");
		Pedido [] lista = {ped1, acasa1};
		
		for (Pedido ele: lista)
			ele.mostrarPedido();
		
		
	}

}
