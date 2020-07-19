package by.academy.classwork.lesson7;

public class Task4 {

	public static void main(String[] args) {
		String s = "Напишите два цикла выполняющих многократное сложение строк, один\r\n"
				+ "с помощью оператора сложения и String, а другой с помощью StringBuilder\r\n"
				+ "и метода append. Сравните скорость их выполнения.";
		String[] str = s.split("\\s+");
		String res1 = "";
		for (int i = str.length - 1; i >= 0; i--) {
			res1 += str[i] + " ";
		}
		System.out.println(res1);
		
		StringBuilder res2 = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			res2.append(str[i]);
			res2.append(" ");
		}
		System.out.println(res2);
	}

}
