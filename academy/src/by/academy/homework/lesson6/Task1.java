package by.academy.homework.lesson6;

public class Task1 {
	public static void main(String... strings) {
		String[] s = { "aqwerfwsdfvg", "asdaasda", "", "sadas" };
		String maxS = s[0], minS = s[0];
		int maxL = s[0].length(), minL = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (maxL < s[i].length()) {
				maxS = s[i];
				maxL = s[i].length();
			}
			if (minL > s[i].length()) {
				minS = s[i];
				minL = s[i].length();
			}
		}
		System.out.println("Max string: " + maxS + "; length: " + maxL);
		System.out.println("Min string: " + minS + "; length: " + minL);
	}
}
