package by.academy.classwork.lesson15.task6;

/**
 *  Ќаписать л€мбда выражение, которое принимает на вход объект типа HeavyBox и 
 *  выводит на консоль сообщение Уќтгрузили €щик с весом nФ. Уќтправл€ем €щик с весом nФ. 
 *  »спользуем функциональный интерфейс Consumer и метод по умолчанию andThen.
 */

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Consumer<HeavyBox> load = box -> System.out.println("ќтгрузили €щик с весом " + box.getN());
		Consumer<HeavyBox> send = box -> System.out.println("ќтправл€ем €щик с весом " + box.getN());

		load.andThen(send).accept(new HeavyBox(10));
	}
}
