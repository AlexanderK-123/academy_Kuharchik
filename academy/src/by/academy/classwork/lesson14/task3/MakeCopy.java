package by.academy.classwork.lesson14.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MakeCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		try (in; out) {

			int a;
			while ((a = in.read()) != -1) {
				out.write(a);
			}
		}

	}

}
