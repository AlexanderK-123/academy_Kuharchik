package by.academy.homework6;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {
		Map<Long, String> map = Stream.generate(() -> new Random().nextInt(100)).
				distinct().limit(100).
				map(m -> (long) (m * Math.PI - 20)).
				filter(f -> f < 100).skip(3).
				collect(Collectors.toMap(k -> k, v -> "Number: " + v));
		
		System.out.println(map);

	}

}
