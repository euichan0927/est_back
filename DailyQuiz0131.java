
public class DailyQuiz0131 {
	final String name;
	DailyQuiz0131(String name){
		this.name=name;
	}

	String getName() {
		return this.name;
	}

	void sleep() {
		System.out.println(this.name + "라는 동물이 잠에 들었습니다.");
	}

	public static void main(String[] args) {
		DailyQuiz0131 dailyQuiz0131 = new DailyQuiz0131("백두산 호랑이");
		dailyQuiz0131.getName();
		dailyQuiz0131.sleep();
	}
}
