package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set1, set2, set3;
		
//		set1 = new HashSet<String>();
		set1 = new TreeSet<String>();
		set1.add("tomas");
		set1.add("eva");
		set1.add("sara");
		set1.add("andres");
		set1.add("esteban");
		set1.add("tomas");
		
//		set1.remove("tomas"); 
		
		for (String ele: set1)
			System.out.println("nombre : " + ele);
		
	}

}
