package Chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.contains("second"));
		System.out.println(list.contains("first"));
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		for(String str :list){
			System.out.println(list);
		}

		List<String> list2 = new LinkedList<>();
		list2.add("first");
		list2.add("second");
		list2.add("third");
		list2.remove(1);
		System.out.println(list2 );
	}
}
