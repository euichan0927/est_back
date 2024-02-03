package Chapter06;

public class MathUtil {
	static final char ADD ='+';
	static final char MINUS = '-';

	static final String MESSAGE_FORMAT = "[회사명] %s 님의 이용약관 개정 메시지 입니다.";

	public static void main(String[] args) {
		System.out.println(MESSAGE_FORMAT.formatted("name"));
	}
}
