package by.academy.homework.lesson6;

public class Task4 {

	public static void main(String[] args) {
		String[] s = { "aqwerfwsdfvg", "asdaasda", "", "sadas" };
		String res = s[0];
		for (int i = 0; i < s.length; i++) {
			if (diffChars(s[i]) < diffChars(res)) {
				res = s[i];
			}
		}
		System.out.println("String: " + res);
	}

	public static int diffChars(String s) {
		StringBuffer str = new StringBuffer();
		String c;
		for (int i = 0; i < s.length(); i++) {
			c = String.valueOf(s.charAt(i));
			if (str.indexOf(c) == -1) {
				str.append(c);
			}
		}
		return str.length();
	}

}
