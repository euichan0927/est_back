package Chapter10;

import java.util.ArrayList;
import java.util.List;

public class ArrListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.remove("a");
		// list.add(10);      //list는 String 타입의 ArrayList로 선언했기 때문에 String 타입의 값만 받을 수 있다. (컴파일오류)
		System.out.println(list);

		// ArrayList nlist= new ArrayList<>();			//ClassCastException 발생
		// nlist.add(1234);
		// String str = (String) nlist.get(0);
		// System.out.println(str);
	}
}
