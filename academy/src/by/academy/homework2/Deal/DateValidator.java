package by.academy.homework2.Deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
	Pattern p1 = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}$");
	Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}$");

	@Override
	public boolean isValid(String string) {

		Matcher m1 = p1.matcher(string);
		Matcher m2 = p2.matcher(string);
		if (m1.find() || m2.find()) {
			return false;
		} else {
			return true;
		}
	}
	public boolean isFirstFormat(String string) {
		Matcher m1 = p1.matcher(string);
		return (m1.find());
	}

}
