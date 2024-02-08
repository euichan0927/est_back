package Chapter10;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("123");
		System.out.println(box.get());

	}

}
