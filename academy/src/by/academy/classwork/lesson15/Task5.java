package by.academy.classwork.lesson15;

/**
 * Ќаписать программу котора€ провер€ет, что строка начинаетс€ буквой УJФили УNФ 
 * и заканчиваетс€ УAФ. »спользуем функциональный интерфейс Predicate. 
 */

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {

		Predicate<String> pred = s -> {
			Pattern p = Pattern.compile("^([JN]).*A$");
			Matcher m = p.matcher(s);
			return m.find();
		};

		System.out.println(pred.test("String"));

		System.out.println(pred.test("Jimmy"));
		System.out.println(pred.test("Jara"));
		System.out.println(pred.test("jarA"));
		System.out.println(pred.test("JARA"));

		System.out.println(pred.test("Norton"));
		System.out.println(pred.test("Narayana"));
		System.out.println(pred.test("narayanA"));
		System.out.println(pred.test("NARAYANA"));
	}

}
