package by.academy.homework3.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import by.academy.homework2.Deal.DateValidator;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner in = new Scanner(System.in);
		DateValidator dateVal = new DateValidator();

		MyCustomDate date1 = new MyCustomDate();
		MyCustomDate date2 = new MyCustomDate();
		enterDate(in, date1, dateVal);
		enterDate(in, date2, dateVal);

		in.close();
		System.out.println(date1.toString() + "\n");
		System.out.println(date2.toString() + "\n");

		daysBetween(date1, date2);

	}

	public static void daysBetween(MyCustomDate date1, MyCustomDate date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date d1, d2;
		d1 = sdf.parse(date1.getStringDate());
		d2 = sdf.parse(date2.getStringDate());
		long diff;
		if (d1.before(d2)) {
			diff = (d2.getTime() - d1.getTime()) / (3600 * 24000);
		} else {
			diff = (d1.getTime() - d2.getTime()) / (3600 * 24000);
		}
		System.out.println("Between dates " + date1.getStringDate() + " & " + date2.getStringDate() + " / " + diff + " days.");
	}

	public static MyCustomDate enterDate(Scanner in, MyCustomDate date, DateValidator dateVal) {
		String strDate;
		boolean flag = true;
		do {
			do {
				System.out.println("Enter the date in the required format (\"dd-mm-yyyy\" or \"dd/mm/yyyy\"):");
				strDate = in.next();
			} while (dateVal.isValid(strDate));

			date.setDate(strDate);
			flag = false;
			return date;

		} while (flag);
	}

}
