package Package3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"un");
		map.put(2,"deux");
		map.put(3,"trois");
		map.put(4,"quatre");
		map.put(5,"cinq");
		Set<Integer> setInt=map.keySet();
		Iterator <Integer> it=setInt.iterator();
		System.out.println("Parcous d'une liste avec keySet");
		while(it.hasNext()) {
			int key=it.next();
			System.out.println("Valeur pour la clé "+key+"="+map.get(key));
		}
	}
}
//l'interface compareTo()'