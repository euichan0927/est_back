package Chapter12;

public class LamdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface finter;

		finter = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		finter.method();

		finter = () ->{
			System.out.println("method call 2");
		};
		finter.method();

		finter = () -> System.out.println("method call 3");
		finter.method();

		MyFunctionalInterface2 finter2;
		finter2 = (x) -> {
			System.out.println("method call" + x);
		};
		finter2.method(5);

		finter2 = (x) -> System.out.println(x*5);
		finter2.method(5);

		MyFunctionalInterface3 finter3;
		finter3 = (x,y) -> {
			return x+y;
		};
		System.out.println(finter3.method(4,6));

		Runnable r = () -> System.out.println("Runnable 실행");
		r.run();

		Supplier<String> s = () -> "리턴되는 값";
		System.out.println(s.get());

		Consumer<String> c = (x) -> System.out.println(x);
		c.c("consumer");

		Function<Integer,String> f = (x) -> String.valueOf(x);
		System.out.println(f.apply(3));

		Predicate<Integer> p = (x) -> x%2==0;
		System.out.println(p.test(2));
	}


}
