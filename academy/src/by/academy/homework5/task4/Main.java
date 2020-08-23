package by.academy.homework5.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		File folder = new File("./academy/src/by/academy/homework5/task4/100txt/");
		if (!folder.exists()) {
			folder.mkdir();
		}

		String text = null, str;

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("./academy/src/by/academy/homework5/task2/file.txt")))) {
			while (reader.read() != -1) {
				text = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		for (int i = 1; i < 101; i++) {
			str = String.valueOf(i) + ".txt";
			File file = new File(folder, str);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			}

			try (FileOutputStream writer = new FileOutputStream(file)) {
				str = text.substring(0, 0 + (int) (Math.random() * text.length()));
				writer.write(str.getBytes());
				writer.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}

		File result = new File("./academy/src/by/academy/homework5/task4/result.txt");
		if (!result.exists()) {
			try {
				result.createNewFile();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		} else {
			result.delete();
			try {
				result.createNewFile();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}

		FileFilter filter = new FileFilter() {
			public boolean accept(File f) {
				return f.getName().endsWith("txt");
			}
		};

		for (File f : folder.listFiles(filter)) {
			try (FileOutputStream writer = new FileOutputStream(result, true)) {
				str = "FileName: [ " + f.getName() + " ] / FileSize: [ " + f.length() + " b ]\n";
				writer.write(str.getBytes());
				writer.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
