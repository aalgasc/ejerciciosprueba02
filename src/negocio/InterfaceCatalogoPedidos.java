package negocio;

import beans.Pedido;

public interface InterfaceCatalogoPedidos {

	public boolean addPedido(Pedido pedido);
	public void listarPedidos();
	public void listarPedidos(int posicion);
	public int buscarUno(Pedido pedido);
	public void exportarPedidos (String fichero);
	public void importarPedidos (String fichero);
	
	
}
