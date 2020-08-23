package by.academy.homework5.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start working!");
		try (FileOutputStream writer = new FileOutputStream("./academy/src/by/academy/homework5/task1/file.txt",
				true)) {
			System.out.println("Enter text:");
			try {
				while (true) {
					String str = reader.readLine();
					if (str.toLowerCase().equals("stop")) {
						break;
					}
					writer.write((str + "\n").getBytes());
				}
				writer.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
