package by.academy.homework3.task1;

public enum DaysOfWeek {
	MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"),
	SATURDAY("Saturday"), SUNDAY("Sunday");

	private String day;

	private DaysOfWeek(String day) {
		this.day = day;
	}

	public String getValue() {
		return day;
	}
}
