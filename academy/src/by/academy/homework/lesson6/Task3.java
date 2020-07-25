package by.academy.homework.lesson6;

public class Task3 {

	public static void main(String[] args) {
		String[] s = { "aqwerfwsdfvg", "asdaasda", "", "sadas" };
		aboveAverage(s);
		belowAverage(s);
	}

	public static double averageLength(String[] s) {
		double sumLen = 0;
		for (int i = 0; i < s.length; i++) {
			sumLen += s[i].length();
		}
		return sumLen / s.length;
	}

	public static void aboveAverage(String[] s) {
		System.out.println("\n6Strings with length above average length:");
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > averageLength(s)) {
				System.out.println(s[i] + " / length: " + s[i].length());
			}
		}
	}

	public static void belowAverage(String[] s) {
		System.out.println("\nStrings with length below average length:");
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < averageLength(s)) {
				System.out.println(s[i] + " /  length: " + s[i].length());
			}
		}

	}
}
