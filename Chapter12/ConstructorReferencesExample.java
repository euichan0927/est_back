package Chapter12;

import java.util.function.BiFunction;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String,Member> function = (x) -> new Member(x);
		Function<String,Member> function1 = Member::new;

		function.apply("김의찬");
		function1.apply("김의찬");

		BiFunction<String,String,Member> function2 = (x,y) -> new Member(x,y);
		function2.apply("김의찬","1");



	}
}
