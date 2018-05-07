package negocio;

import beans.Pedido;

public class CatalogoPedidos {
	private Pedido[] lista;
	private int cuantosVan;
	
	
	public CatalogoPedidos(){
		lista = new Pedido[0];
	
		
		cuantosVan =0;
		
	}

	public CatalogoPedidos(int numeroElementos){
		lista = new Pedido[numeroElementos];
		cuantosVan =0;
		
	}
	
	//metodos de la lista
	
	public boolean addPedido(Pedido pedido){
		
		
		if (cuantosVan == 10){
			return false;
		}else{
			lista[cuantosVan] = pedido ;
			cuantosVan++ ;
			return true ;
		}
			
		
	}
	
	
	public void listarPedidos(){
		for (int i=0; i < cuantosVan; i++)
			lista[i].mostrarPedido();
	}
			
			
			
	
	
	public int buscarPedido(Pedido pedido){
		for (int i = 0 ; i<cuantosVan; i++){
			if (lista[i].equals(pedido))
				return i;
		}
		return -1;
	}
	
	public Pedido buscarPedido(int posicion){
		if (posicion >= cuantosVan || posicion < 0)
		return null;
		return lista[posicion];
	}
	
	
	
	
}
	





	

