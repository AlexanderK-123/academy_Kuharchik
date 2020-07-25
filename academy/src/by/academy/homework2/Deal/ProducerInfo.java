package by.academy.homework2.Deal;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Inherited;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, LOCAL_VARIABLE })
@Inherited
public @interface ProducerInfo {

	String name();

	String company();

	String[] productTypes() default {};

	int number() default 0;

}
