package Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
	
	private Catalogo catalogo;

	public static void main(String[] args) {
		new Menu().start();
	}
	
	public Menu() {
		catalogo=new Catalogo();
	}
	
	
	public void start() {
		int operacion=0;
		
		do {
			
			System.out.println("\n 1:Nuevo \n 2:Listar \n 3:Borrar \n 4:Buscar \n 0:Salir ");
			
			operacion=leerNumero();
			if(operacion==1)
				nuevo();
			else if(operacion==2)
				lista();
			else if(operacion==3)
				borrar();
			else if(operacion!=0)
				System.out.println("Error opcion!");
				
		} while (operacion != 0);
		
		System.out.println("EXIT");
		
	}
	
	public void nuevo() {
		
		Pedido pedidoNuevo = nuevoPedidio();
		
		boolean res=catalogo.addPedido(pedidoNuevo);
		
		mensaje("Nuevo Pedidio: ",res);
		
		
	}
	public void lista() {
		System.out.println("Listar");
		catalogo.listar();
		
	}
	public void borrar() {
		boolean resultado=false;
		
		catalogo.listar();
		
		int id=leerNumero();
		
		Pedido pedidoAborrar=catalogo.buscarPedido(id);
		
		
		if(pedidoAborrar != null) {
			
			if(mensajePregunta("Borrar pedidio?: "+pedidoAborrar)) {
				resultado=catalogo.borrarPedido(pedidoAborrar);
				
			}
			
			
		}
			
		mensaje("Borrardo? ",resultado);
		
	}
	public void buscar() {
		
		System.out.println("Id? :");
		int numero= leerNumero();
		catalogo.listar();
		
		
	}
	
	private Pedido nuevoPedidio() {
		
		String desc="";
		int id=0;
		
		System.out.print("Cliente Id: ");
		id=leerNumero();
		System.out.println("Cliente Descripcion: ");
		desc=leerCadena();
		Cliente cliente = new Cliente(id, desc);
		
		System.out.print("Pedido Id: ");
		id=leerNumero();
		System.out.println("Pedido Descripcion: ");
		desc=leerCadena();
		
		
		return new Pedido(id, desc, cliente);
		
		
	}
	
	
	
	private int leerNumero() {
		int numero=-1;
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			
			boolean error;
			
			do {
				error=false;
				
				try {
				
					numero=Integer.parseInt(bufferedReader.readLine());
					System.out.println("numero: "+numero);
					
				} catch (Exception e) {
					System.out.println("[ERROR] leer numero: "+e.getMessage());
					error=true;
				}
				
			} while (error);
			
		} catch (Exception e) {
			System.out.println("[ERROR] ");
		}
		
		return numero;

	}

	private String leerCadena() {
		String cadena="";
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			
			boolean error=false;
			do {
				
				error=false;
				
				try {
				
					cadena=bufferedReader.readLine();
				
				} catch (Exception e) {
					System.out.println("[ERROR] leerCadena");
					error=true;
				}
				
			} while (error);
			
		} catch (Exception e) {
			System.out.println("[ERROR]");
		}
		
		return cadena;

	}
	private char leerCaracter() {
		char c=' ';
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			
			boolean error=false;
			do {
				error=false;
				
				try {
				
					c=(char)bufferedReader.read();
					while (bufferedReader.read() !=  '\n'); 
					
				
				} catch (Exception e) {
					System.out.println("[ERROR] leerCaracter");
					error=true;
				}
				
			} while (error);
			
		} catch (Exception e) {
			System.out.println("[ERROR] ");
		}
		
		return (char)c;

	}
	
	private void mensaje(Object... mensaje) {
		System.out.println(mensaje[0]+": "+mensaje[1]);
	}
	
	private boolean mensajePregunta(String mensaje) {
		System.out.println(mensaje+" s/n");
		boolean res=false;
		
		char c=' ';
		do {
			c=leerCaracter();
			if(c=='s')
				return true;
			else if(c=='n')
				return false;
			else 
				System.out.println("[ERROR]");
			
		}while((c!='s') && (c!='n'));
		
		return res;
		
	}
}
