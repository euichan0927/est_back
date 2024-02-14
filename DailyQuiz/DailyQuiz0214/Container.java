package DailyQuiz.DailyQuiz0214;

public class Container<T> {

	private T name;
	public void set(T name) {
		this.name=name;
	}
	public T get() {
		return name;
	}
}
