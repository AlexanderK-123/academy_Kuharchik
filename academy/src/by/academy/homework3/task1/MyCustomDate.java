package by.academy.homework3.task1;

/*  Создать класс MyCustomDate, используя вложенные классы Год, Месяц, День. 
 *  Методы: задать дату, вывести на консоль день недели по заданной дате. 
 *  День недели представить в виде перечисления. 
 *  Рассчитать количество дней, в заданном временном промежутке.
 *  Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
 *  После валидации в конструкторе создаем объекты класса Year, Month, Day.
 *  Добавить метод, который проверяет высокосный ли год или нет.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCustomDate {

	private Day day;
	private Month month;
	private Year year;

	MyCustomDate() {
		super();
	}

	MyCustomDate(String date) {
		super();
		setDate(date);
	}

	MyCustomDate(int d, int m, int y) {
		super();
		day = new Day(d);
		month = new Month(m);
		year = new Year(y);
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public class Day {
		int day;

		public Day() {
			super();
		}

		public Day(String day) {
			super();
			this.day = Integer.parseInt(day);
		}

		public Day(int day) {
			super();
			this.day = day;
		}
	}

	public class Month {
		Integer month;

		public Month() {
			super();
		}

		public Month(String month) {
			super();
			this.month = Integer.parseInt(month);
		}

		public Month(Integer month) {
			super();
			this.month = month;
		}
	}

	public class Year {
		int year;

		public Year() {
			super();
		}

		public Year(String year) {
			super();
			this.year = Integer.parseInt(year);
		}

		public Year(int year) {
			super();
			this.year = year;
		}
	}

	public boolean isLeapYear() {
		if ((year.year % 4 == 0) || (year.year % 400 == 0) && (year.year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	public void setDate(String s) {
		day = new Day(s.substring(0, 2));
		month = new Month(s.substring(3, 5));
		year = new Year(s.substring(6));
	}

	public String getStringDate() {
		return day.day + "-" + month.month + "-" + year.year;
	}

	public int numberOfWeek() {
		Calendar c = new GregorianCalendar(year.year, month.month - 1, day.day);
		return c.get(Calendar.DAY_OF_WEEK);
	}

	public String printDayOFWeek() {
		String str = "Day of week: ";
		switch (numberOfWeek()) {
		case (1):
			return str + DaysOfWeek.MONDAY.getValue();
		case (2):
			return str + DaysOfWeek.TUESDAY.getValue();
		case (3):
			return str + DaysOfWeek.WEDNESDAY.getValue();
		case (4):
			return str + DaysOfWeek.THURSDAY.getValue();
		case (5):
			return str + DaysOfWeek.FRIDAY.getValue();
		case (6):
			return str + DaysOfWeek.SATURDAY.getValue();
		case (7):
			return str + DaysOfWeek.SUNDAY.getValue();
		default:
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Day: ");
		builder.append(day.day);
		builder.append(" / Month: ");
		builder.append(month.month);
		builder.append(" / Year: ");
		builder.append(year.year);
		builder.append("\n" + printDayOFWeek());
		if (isLeapYear()) {
			builder.append(" / Leap year. ");
		} else {
			builder.append(" / Common year. ");
		}
		return builder.toString();
	}
}
