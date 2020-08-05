package by.academy.classwork.lesson13.task5;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<HeavyBox> set = new TreeSet<>();

		HeavyBox q = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox w = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox e = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox r = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox t = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox y = new HeavyBox(randNum(), randNum(), randNum(), randNum());
		HeavyBox u = new HeavyBox(randNum(), randNum(), randNum(), randNum());

		set.add(q);
		set.add(w);
		set.add(e);
		set.add(r);
		set.add(t);
		set.add(y);
		set.add(u);

		for (int j = 0; j < set.size(); j++) {
			System.out.println(set);
		}

	}

	public static int randNum() {
		return (int) (Math.random() * (100) + 1);
	}

}
