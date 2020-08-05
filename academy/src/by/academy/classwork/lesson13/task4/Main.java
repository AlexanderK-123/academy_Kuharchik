package by.academy.classwork.lesson13.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> catalog = new HashMap<String, Integer>();
		
		putToCatalog(catalog, "A");
		putToCatalog(catalog, "A");
		putToCatalog(catalog, "A");
		
		putToCatalog(catalog, "b");
		putToCatalog(catalog, "b");
		putToCatalog(catalog, "b");
		putToCatalog(catalog, "b");
		
		putToCatalog(catalog, "c");
		putToCatalog(catalog, "c");
		
		System.out.println(catalog);

	}
	
	public static void putToCatalog(Map<String, Integer> catalog, String product) {
		if(catalog == null) {
			return;
		}
		if (catalog.containsKey(product)) {
			catalog.put(product, catalog.get(product)+1);
		} else {
			catalog.put(product, 1);
		}
	}

}
