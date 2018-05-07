package beans;

public class Cliente {
	private String cif, razonSocial;
	private double facturacionAnual;

	
	public Cliente(String cif, String razonSocial){
		this.cif = cif;
		this.razonSocial = razonSocial;

	}
	
	
	public Cliente(String cif, String razonSocial, double facturacionAnual, int numEmpleados) {
		super();
		this.cif = cif;
		this.razonSocial = razonSocial;
		this.facturacionAnual = facturacionAnual;

	}


	public Cliente(){};
	

	
	public void setCif(String cif){
		this.cif = cif;
	}
	public String getCif() {
		return cif;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public double getFacturacionAnual() {
		return facturacionAnual;
	}
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}




	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", razonSocial=" + razonSocial + ", facturacionAnual=" + facturacionAnual;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cif == null) {
			if (other.cif != null)
				return false;
		} else if (!cif.equals(other.cif))
			return false;
		return true;
	}
	
	//metodos de la clase

	public char getLetra(){
		return cif.charAt(0);
	}
	
	/*
	public boolean equals(Object obj){
		if (obj==null)
			return false;
		if (this==obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
//		Cliente otro = (Cliente)obj;
		if (this.cif.equals( ((Cliente)obj).cif) )
			return true;
		else
			return false;
	}
	/*	
	}
	
	public boolean equals (Cliente cliente) {
		if (cliente == null)
			return false;
		if (this == cliente)
			return true;
		if (this.cif.equals(cliente.cif))
			return true;
		else
			return false; */

	
	}
	

