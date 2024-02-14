package DailyQuiz.DailyQuiz0214;

public class TwoContainer<T,M> {
	private T key;
	private M value;

	void set(T key,M value){
		this.key=key;
		this.value=value;
	}
	public T getKey() {
		return key;
	}
	public M getValue() {
		return value;
	}

}
