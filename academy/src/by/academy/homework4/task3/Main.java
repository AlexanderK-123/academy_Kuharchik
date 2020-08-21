package by.academy.homework4.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		String text = "Можно писать все в main. Не нужно создавать новых классов.";

		for (int i = 0; i < text.length(); i++) {
			if (map == null) {
				return;
			}
			if (map.containsKey(text.charAt(i))) {
				map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
			} else {
				map.put(text.charAt(i), 1);
			}
		}

		for (Character e : map.keySet()) {
			System.out.println(e + " " + map.get(e));
		}

	}
}
