package by.academy.homework5.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		String str = null;
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("./academy/src/by/academy/homework5/task2/file.txt")))) {
			while (reader.read() != -1) {
				str = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		str = str.replaceAll(" ", "");

		try (FileOutputStream writer = new FileOutputStream("./academy/src/by/academy/homework5/task2/result.txt")) {
			writer.write(str.getBytes());
			writer.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
