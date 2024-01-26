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
		System.out.println(value2);		//value2 사용 불가능
	}
}
