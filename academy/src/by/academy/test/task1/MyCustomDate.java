package by.academy.test.task1;

/*  ������� ����� MyCustomDate, ��������� ��������� ������ ���, �����, ����. 
 *  ������: ������ ����, ������� �� ������� ���� ������ �� �������� ����. 
 *  ���� ������ ����������� � ���� ������������. 
 *  ���������� ���������� ����, � �������� ��������� ����������.
 *  ���� �� ������������� - ������ � ������� dd-mm-yyyy, �������� ��������� ��� ���� ������. 
 *  ����� ��������� � ������������ ������� ������� ������ Year, Month, Day.
 *  �������� �����, ������� ��������� ���������� �� ��� ��� ���.
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

	MyCustomDate(String strDate) {
		super();
		setDate(strDate);
	}

	MyCustomDate(int d, Integer m, int y) {
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

	public void setDate(String strDate) {
		day = new Day(strDate.substring(0, 2));
		month = new Month(strDate.substring(3, 5));
		year = new Year(strDate.substring(6));

	}

	public String getStringDate() {
		return day.day + "-" + month.month + "-" + year.year;
	}

	public int numberOfWeek() {
		Calendar c = new GregorianCalendar(year.year, month.month - 1, day.day);
		return c.get(Calendar.DAY_OF_WEEK);

	}

	public enum DayOfWeek {
		Monday("�����������"), Tuesday("�������"), Wednesday("�����"), Thursday("�������"), Friday("�������"),
		Saturday("�������"), Sunday("�����������");

		private String id;

		private DayOfWeek(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public String printDayOFWeek() {
		String str;
		switch (numberOfWeek()) {
		case (1):
			return str = "���� ������: " + DayOfWeek.Sunday.getId();
		case (2):
			return str = "���� ������: " + DayOfWeek.Monday.getId();
		case (3):
			return str = "���� ������: " + DayOfWeek.Tuesday.getId();
		case (4):
			return str = "���� ������: " + DayOfWeek.Wednesday.getId();
		case (5):
			return str = "���� ������: " + DayOfWeek.Thursday.getId();
		case (6):
			return str = "���� ������: " + DayOfWeek.Friday.getId();
		case (7):
			return str = "���� ������: " + DayOfWeek.Saturday.getId();
		default:
			return "";
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("����: ���� = ");
		builder.append(day.day);
		builder.append(". ����� = ");
		builder.append(month.month);
		builder.append(". ��� = ");
		builder.append(year.year);
		builder.append("\n" + printDayOFWeek());
		if (isLeapYear()) {
			builder.append(". ���������� ���");
		} else {
			builder.append(". ������������ ���");
		}
		return builder.toString();
	}

}
