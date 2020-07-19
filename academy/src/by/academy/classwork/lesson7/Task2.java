package by.academy.classwork.lesson7;

public class Task2 {

	public static void main(String[] args) {
		String s = "Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно\r\n"
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\r\n"
				+ "текста также могут быть пробелы, но могут и отсутствовать.";

		String[] str = s.split("\\s+");
		System.out.println(str.length);
		for (String e : str) {
			System.out.println(e);
		}
	}

}
