package colecciones;

import java.util.HashMap;
import java.util.Map;

public class TestMapa {

	public static void main(String[] args) {
		Map<Integer, String> mapa1, mapa2;
		mapa1 = new HashMap<Integer, String>();
		String numero = "12";
		
		mapa1.put (1, "tomas");
		mapa1.put (2, "sara");
		mapa1.put (3, "eva");
		mapa1.put (4, "esteban");
		mapa1.put (2, "maria");
		mapa1.put(Integer.valueOf(numero), "sebastian");
		
		
		for (Integer ele: mapa1.keySet())
			System.out.println(ele);
		for (String ele: mapa1.values())
			System.out.println(ele);
		
		for (Integer ele: mapa1.keySet())
			System.out.println(ele + " - " + mapa1.get(ele));
		
	}

}
