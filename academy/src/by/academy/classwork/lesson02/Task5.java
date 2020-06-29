package by.academy.classwork.lesson02;

public class Task5 {
	public static void main(String[] args) {
		int s = 3700;
		int sec;
		int m;
		int min,h;
		int day, week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		day = h % 24;
		week = day % 7;
		System.out.println(h + "hours" + min + "min" + sec + "seconds");
		
	}
}
