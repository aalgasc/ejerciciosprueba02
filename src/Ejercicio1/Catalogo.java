package Ejercicio1;

public class Catalogo {

	private Pedido[] pedidos;
	private int cantiadad;
	
	public static void main(String[] args) {
		
		Catalogo catalogo= new Catalogo();
		
		
		catalogo.listar();
		
		Cliente cliente= new Cliente(1, "11");
		
		catalogo.addPedido(new Pedido(4, "desc0", cliente));
		
		catalogo.listar();
		
		catalogo.borrarPedido(1);
		
		catalogo.listar();
	}
	
	
	public Catalogo() {
		super();
		pedidos= new Pedido[5];
		cantiadad=0;
		
		
		Cliente cliente= new Cliente(1, "11");
		
		pedidos[0]= new Pedido(1, "desc0", cliente);
		pedidos[1]= new Pedido(2, "desc1", cliente);
		pedidos[2]= new Pedido(3, "desc2", cliente);
		cantiadad=3;
		
		
		
		
		
	}
	

	public boolean addPedido(Pedido pedido) {
		if(siListaLlena())
			return false;
		
		int longAnterior= cantiadad;		
		int indice= buscarPedido(pedido);

		if(indice == -1) {
			pedidos[cantiadad]=pedido;
			cantiadad++;	
		}
		
		return longAnterior<cantiadad;
	}
	
	//-----------------------------
	public void listar() {
		for (int i = 0; i < cantiadad; i++) 
			pedidos[i].mostrar();
		
	}
	public boolean listar(int desde) {
		if (comprobarIndice(desde))
			for (int i = desde; i < cantiadad; i++)
				pedidos[i].mostrar();
		
		return false;
	}
	
	//-----------------------------
	public int buscarPedido(Pedido pedido) {
		int resultado=-1;
		
		if(siListaVacia())
			return resultado;
		
		if(comprobarPedidio(pedido)) {
			
			for (int i = 0; i < cantiadad; i++) {
				if(pedidos[i].equals(pedido)) {
					resultado=i;
					break;
				}
			}
		}
		
		
		return resultado;
	}
	public Pedido buscarPedido(int id) {
		Pedido p=null;
		for (int i = 0; i < cantiadad; i++) {
			
			if(pedidos[i].getId()== id) {
				p=pedidos[i];
				break;
			}
		}
		
		
		return p;
	
	}
	
	//-----------------------------
	public Pedido borrarPedido(int indice) {
		if(siListaVacia())
			return null;

		Pedido pedidoAborrar=null;
		pedidoAborrar=buscarPedido(indice);
		
		if(pedidoAborrar != null) {
			if(eliminarPosicion(indice)) 
				pedidoAborrar=null;
			
		}
		
		return pedidoAborrar;
	}
	public boolean borrarPedido(Pedido pedido) {
		if(siListaVacia())
			return false;
		
		boolean res=false;
		int pedidoAborrar=-1;
		pedidoAborrar=buscarPedido(pedido);
		
		if(pedidoAborrar != -1) {
			if(eliminarPosicion(pedidoAborrar)) {
				res=true;
			}
		}
		
		
		
		return res;
	}
	
	//-----------------------------
	public void ordena() {

	}
	
	public int borrarTodo() {
		return 0;
	}
	
	//-----------------------------
	public boolean comprobarPedidio(Pedido pedido) {

		if(pedido==null)
			return false;
		else
			return true;
	}
	public boolean comprobarIndice(int index) {

		if (index >=0 && index <= cantiadad)
			return true;
		else
			return false;

	}
	public boolean siListaLlena() {
		
		if (cantiadad==pedidos.length)
			return true;
		else
			return false;
	}
	public boolean siListaVacia() {
		
		if (cantiadad==0)
			return true;
		else
			return false;
	}
	public boolean eliminarPosicion(int index) {
		
		//puede fallar
		for (int i = index; i < cantiadad; i++) {
			pedidos[i]=pedidos[i+1];
		}
		cantiadad--;
		return true;
	}
	
	
}
