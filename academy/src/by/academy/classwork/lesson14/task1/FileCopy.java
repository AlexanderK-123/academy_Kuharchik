package by.academy.classwork.lesson14.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {

		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;

		FileInputStream in = new FileInputStream("in.txt");
		FileOutputStream out = new FileOutputStream("out.txt");
		try (in; out) {

			int a;
			while ((a = in.read()) != -1) {
				out.write(a);
			}
		}

		try {
			fileIn = new FileInputStream("file.txt");
			fileOut = new FileOutputStream("copied_file.txt");

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null) {
				fileOut.close();
			}
		}
	}
}
