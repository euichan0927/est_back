package WeeklyQuiz04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if(IsTrue(input)){
			System.out.println("True");
		}
		else{
			System.out.println("False");

		}
	}
	public static boolean IsTrue(String input){
		Stack<String> stack = new Stack<>();

		if (input.charAt(0) == ')') {
			return false;
		}

		for (int i = 0; i < input.length(); i++) {

			if(input.charAt(i)==')' && stack.isEmpty()==false){
				stack.pop();
			}
			else {
				stack.push(String.valueOf(input.charAt(i)));
			}

		}

		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}
