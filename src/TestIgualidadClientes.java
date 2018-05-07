import beans.Cliente;

public class TestIgualidadClientes {

	public static void main(String[] args) {
		Cliente cli1,cli2;
		cli1 = new Cliente("A111", "AAC", 12000, 5);
		cli2 = new Cliente("A111", "AAC", 12000, 5);	
		
		if (cli1==cli2)
		System.out.println("clientes iguales");
		else
		System.out.println("clientes disintos");
		
		System.out.println(cli1 + " - \n" + cli2 ); 
		if (cli1.equals(null))
		System.out.println("iguales por equals");
		else
		System.out.println("distintos por nanaio equals");
	}

}
