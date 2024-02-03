package Chapter05;

import java.util.ArrayList;

public class VariableExample {
	public static void main(String[] args) {
		int value=10;
		if(value==10){
			int value2=11;				//if문에서 선언한 value2
			System.out.println(value2);
		}

		for (int i = 0; i < 5; i++) {
			int value2=1;				//for문 블록에서 선언한 value2
			System.out.println(value+1);
			System.out.println(value2+1);
		}
		System.out.println(value);		//value 사용 가능
		//System.out.println(value2);		//value2 사용 불가능

		String name="euichan";
		String string = new String("euichan");
		System.out.println(name==string);			//false
		System.out.println(name.equals(string));	//true, string을 비교할때는 eqauls()를 사용해야함

		// HelloJava 문자열에서 J를 기준으로 나눠서 문자열배열로 반환하는 코드 작성
		String string2 ="HelloJava";
		String[] result  = string2.split("J");
		for (int i = 0; i <result.length ; i++) {
			System.out.println(result[i]);
		}


		// HelloJava 문자열에서 7번째 문자값을 출력하는 코드 작성
		System.out.println(string2.charAt(6));

		// 오토박싱  int -> Integer
		ArrayList<Integer> arrayList = new ArrayList<>();		//참조자료형 Integer 사용
		arrayList.add(1);			//Integer타입이 아닌 int 타입을 넣어주어도 자동으로 박싱이 되는 오토박싱.
		arrayList.add(2);
		// arrayList.add(3.14);		->오류 발생 ArrayList 자료형은 <Integer>로 주어졌기 때문에 정수형 값만 들어올 수 있음.
	}
}
