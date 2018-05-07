package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
//		Set<String> conj1, conj2, conj3;
		List<String> lista1, lista2, lista3;
//		lista1 = new LinkedList<String>();
		lista1 = new ArrayList<String>();
//		lista1 = new Vector<String>();
		lista1.add("alvarito");
		lista1.add("eva");
		lista1.add("sara");
		lista1.add("andres");
		lista1.add("marta");
		lista1.add("esteban");
		lista1.add("alvarito");
		//borro uno
		System.out.println(lista1.remove("alvarito"));
		System.out.println(lista1.indexOf("sara"));
		System.out.println(lista1.contains("alvarito"));
		System.out.println(lista1.indexOf("alvarito"));
		System.out.println(lista1.lastIndexOf("alvarito"));
		System.out.println(lista1.size());
		
		String cadena = "tomas";
		
		
		for (String ele:lista1)
			System.out.println("nombre : " + ele);
		Collections.sort(lista1);
		System.out.println("======= Iterador ==========");
		Iterator<String> it1=lista1.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		
	}

}
