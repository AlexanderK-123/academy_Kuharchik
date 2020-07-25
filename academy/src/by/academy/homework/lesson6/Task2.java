package by.academy.homework.lesson6;

class Task2 {
	public static void main(String... strings) {
		String[] s = { "aqwerfwsdfvg", "asdaasda", "", "sadas" };
		System.out.println("Decrease sort:");
		print(decSort(s));
		System.out.println("Increase sort:");
		print(incSort(s));

	}

	public static String[] incSort(String[] s) {
		String bufStr;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[j].length() < s[i].length()) {
					bufStr = s[i];
					s[i] = s[j];
					s[j] = bufStr;
				}
			}
		}
		return s;
	}

	public static String[] decSort(String[] s) {
		String bufStr;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[j].length() > s[i].length()) {
					bufStr = s[i];
					s[i] = s[j];
					s[j] = bufStr;
				}
			}
		}
		return s;
	}

	public static void print(String[] s) {
		for (String e : s) {
			System.out.println(e);
		}
	}
}
