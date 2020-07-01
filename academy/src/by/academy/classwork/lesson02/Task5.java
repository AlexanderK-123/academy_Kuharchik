package by.academy.classwork.lesson02;

public class Task5 {
	public static void main(String[] args) {
		int s = 695800;
		int sec;
		int m;
		int min,h,hour;
		int d,day,w, week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 7;
		week = w % 7;
		System.out.println(week + "weeks" + day + "days" + hour + "hours" + min + "min" + sec + "seconds");
		
	}
}
