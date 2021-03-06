package by.academy.homework.lesson6;

public class Task5 {

	public static void main(String[] args) {
		String[] s = { "aqwerfwsdfvg", "asdaasda", "", "sadas" };
		String str[] = latinChars(s);
		System.out.println("Quantity strings:" + equalQuantityChars(str));
	}

	public static String[] latinChars(String[] s) {
		String res[] = new String[s.length];
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if ((s[i].charAt(j) > 64 && s[i].charAt(j) < 91) && (s[i].charAt(j) > 96 && s[i].charAt(j) < 116)) {
					res[i] = s[i];
				}
			}
		}
		return res;
	}

	public static int equalQuantityChars(String[] s) {
		int result = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 65; j < 116; j++) {
				if (j == 65 || j == 69 || j == 73 || j == 79 || j == 85 || j == 89) {
					a += count(s[i], ((char) j));
				} else {
					if (j < 91 && j > 96) {
						b += count(s[i], ((char) j));
					}
				}
			}
			if (a == b) {
				result++;
			}
		}
		return result;
	}

	public static int count(String str, char j) {
		return (str.length() - str.replace(String.valueOf(j), "").length());
	}
}
