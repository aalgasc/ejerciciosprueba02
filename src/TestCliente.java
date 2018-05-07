import beans.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		Cliente cli1, cli2, cli3;
/*		cli1 = new Cliente();
		cli1.cif="B54295";
		cli1.razonSocial="Desguaces Palomino";
		System.out.println(cli1.cif);
		System.out.println(cli1.facturacionAnual);
		System.out.println(cli1);
		cli2 = new Cliente();
		cli2.cif="12345-a";
		cli2.razonSocial="COMPUTER SPACE";
		*/
		cli1= new Cliente("B11111", "Computer Space");
	//	cli1.setCif("B43820");
		System.out.println(cli1.getCif() + " - " + cli1.getRazonSocial());
		cli2 = new Cliente ();
		System.out.println(cli2 + " - " + cli1);
		cli2=cli1;
		cli2.setRazonSocial("pepito");
		System.out.println(cli1.getRazonSocial());
		
		
		
	}

}
