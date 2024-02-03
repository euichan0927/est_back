package DailyQuiz;

public class DailyQuiz0130 {
	public static void main(String[] args) {
		int[] marks = {40, 50, 60, 70, 80, 10};
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 50) {
				System.out.println(i + 1 + "번 학생 축하 ㅋㅋ");
			}
		}
		// 구구단(2~9단) 출력 프로그램을 작성해보세요.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		// 1번 문제
		// for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
		int[][] a = {{1, 2, 3}, {4, 5, 6}};
		int[][] b = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[i][j] = a[i][j];
			}
		}
		// a배열과 b배열 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
				System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
			}
		}

		//2번 문제
		// for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
		int[] array = {12, 4, 7, 20, 1};

		// 코드 작성하는 부분
		int max = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (max < array[i]) {
				max = array[i];
			}
		}
		double avg = (double)sum / array.length;
		// ...

		// 결과 출력 (최대값: max, 평균: avg)
		System.out.println(max);
		System.out.println(avg);

		//3번 문제
		//0부터 20까지 짝수만 출력하는 코드를 작성해보세요.
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		Solution solution = new Solution();
		System.out.println(solution.solution(10));

		Solutions solutions = new Solutions();
		String[] strlist = {"euichan","aaa","b"};
		System.out.println(solutions.solution(strlist));
	}
}
//4번 프로그래머스 - 짝수의 합
class Solution {
	int sum=0;
	public int solution(int n) {
		for (int i = 1; i <= n; i++) {
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}
}
//4번 프로그래머스 - 배열의 평균 값
class Solution2 {
	double sum=0;
	public double solution(int[] numbers) {
		for (int i = 0; i <numbers.length ; i++) {
			sum+=numbers[i];
		}
		return sum/numbers.length;
	}
}
//4번 프로그래머스 - 양꼬치
class Solution3 {
	public int solution(int n, int k) {
		int sum=0 ,num=0;
		num= n/10;
		sum+=12000*n + 2000*(k-num);
		return sum;
	}
}
//강의 중 코테 연습 - 프로그래머스 "머쓱이보다 키 큰 사람"
class Solution4 {
	public int solution(int[] array, int height) {
		int count=0;
		for (int i = 0; i <array.length ; i++) {
			if(array[i]>height)
			{
				count+=1;
			}
		}
		return count;
	}
}

//강의 중 코테 연습 - 프로그래머스 "배열 원소의 길이"
class Solutions{
	public int[] solution(String[] strlist) {
		int[] answer =new int[strlist.length];
		for (int i = 0; i <strlist.length ; i++) {
			answer[i]=strlist[i].length();
		}
		return answer;
	}

}


