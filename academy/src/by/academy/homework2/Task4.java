package by.academy.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//3. С помощью SimpleDateFormat пропарсить данные, 
//введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//Вывести строку в следующем формате:
//День: <Day>
//Месяц: <Month>
//Year: <Year>

public class Task4 {

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	public static SimpleDateFormat format3 = new SimpleDateFormat(" : <d>\n");
	public static SimpleDateFormat format4 = new SimpleDateFormat(" : <M>\n");
	public static SimpleDateFormat format5 = new SimpleDateFormat(" : <yyyy>\n");

	public static void main(String... args) throws ParseException {

		String[] tests1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020", "11" };
		String[] tests2 = { "50-50-9999", "00-00-0000", "13-12-2020", "12-12-2020", "11" };

		for (String t : tests1) {
			boolean isValid = Task3.isValidDateString(t);
			if (isValid) {
				Date date = format1.parse(t);
				System.out.println(date);

				Calendar c = new GregorianCalendar();
				c.setTime(date);

				System.out.printf("%s%s", "Day", format3.format(c.getTime()));
				System.out.printf("%s%s", "Month", format4.format(c.getTime()));
				System.out.printf("%s%s", "Year", format5.format(c.getTime()));
			}
		}

		for (String t : tests2) {
			boolean isValid = Task3.isValidDateString(t);
			if (isValid) {
				Date date = format2.parse(t);
				System.out.println(date);

				Calendar c = new GregorianCalendar();
				c.setTime(date);

				System.out.printf("%s%s", "Day", format3.format(c.getTime()));
				System.out.printf("%s%s", "Month", format4.format(c.getTime()));
				System.out.printf("%s%s", "Year", format5.format(c.getTime()));
			}
		}
	}
}
