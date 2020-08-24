package by.academy.homework.lesson5.task4;

import java.util.Scanner;

public class Main {
	public static void main(String... strings) {
		Scanner in = new Scanner(System.in);
		Reader[] readers = new Reader[3];
		System.out.println("Registration:");
		for (int i = 0; i < readers.length; i++) {
			System.out.println("Next reader:");
			readers[i] = new Reader(in.nextLine(), in.nextInt(), in.nextLine(), in.nextLine(), in.nextInt());
		}
		in.close();
		System.out.println("Readers:");
		for (int i = 0; i < readers.length; i++) {
			readers[i].showReader();
		}

	}
}
