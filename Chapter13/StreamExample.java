package Chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		for(int n:list){
			if(n%2==0){
				System.out.println(n);
			}
		}
		list.stream().filter(n->n%2==0).forEach(System.out::println);

		List<Integer> list2 = Arrays.asList(1,10,4,1,5,2,2);
		list2.stream().distinct().forEach(System.out::println);			//distinct -> stream을 이용한 중복 제거

		List<String> list3 = Arrays.asList("김의찬","김밥","김민재","노노","므므");
		list3.stream().filter(x->x.startsWith("김")).forEach(System.out::println);		//startsWith로 시작문구 filter

		List<String> list4 = Arrays.asList("euichan","son");
		list4.stream().map(x->x.toUpperCase()).forEach(System.out::println);			//대문자 변경

		List<String> list5 = Arrays.asList("Hello World", "Java stream");
		list5.stream().flatMap(str->Arrays.stream(str.split(" "))).forEach(System.out::println);//flatMap을 사용해서 하나의 문자열을 2개씩 나눠 총 4개로 변환

		list2.stream().sorted().forEach(System.out::println);							//오름차순 정렬
		list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);	//내림차순 정렬

		int sum= list.stream()
				.filter(x->x%2==0)
				.mapToInt(x->x)
				.sum();					//list에서 짝수만 합하여 출력
		System.out.println(sum);

		List<Integer> newList = list.stream()
			.filter(x->x%2==0)
			.collect(Collectors.toList());	//filter 조건을 이용한 새로운 리스트 생성
		System.out.println(newList);

		List<Integer> list1 = Arrays.asList(1,1,1,2,3,3,4,4,4,4);
		System.out.println(list1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())));

	}
}
