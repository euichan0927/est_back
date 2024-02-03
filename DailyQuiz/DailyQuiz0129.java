package DailyQuiz;

public class DailyQuiz0129 {
	public static void main(String[] args) {
		// 1번 문제
		int number1 = 10;
		double number2 = 2.0;
		int result1 = (int)(number1 + number2);
		int result2 = (int)(number1 - number2);
		int result3 = (int)(number1 * number2);
		int result4 = (int)(number1 / number2);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		// 2-1
		System.out.println(10 / 2 + 3 * 4);

		// 2-2
		int number = 10;
		result1 = number + 1;
		result2 = number++;
		result3 = number;
		result4 = --number;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		// 2-3
		int num1 = 5;
		int num2 = 7;
		System.out.println((num1 > 5) && (num2 > 5));
		System.out.println((num1 > 5) || (num2 > 5));
		System.out.println(!((num1 > 5) && (num2 > 5)));

		// 4번 문제
		String str1 = new String("Hello world!");
		String str2 = new String("Hello world!");
		System.out.println(str1.equals(str2));

	}

	// 5-1

	class Solution {
		public int solution(int number, int n, int m) {
			if(number%n==0 && number%m==0) return 1;
			else return 0;
		}
	}
	// 5-2
	class Solution2 {
		public int solution2(int num, int n) {
			if(num%n==0) return 1;
			else return 0;
		}
	}

	// 5-3
	class Solution3 {
		public int solution3(int a, int b, boolean flag) {
			if(flag) return a+b;
			else return a-b;
		}
	}
}


