package Chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice1 {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,1,2,2,2,3,4,5,5,5);

		List<String> result=integerList
			.stream()
			.distinct()
			.map(x->x.toString())
			.collect(Collectors.toList());
		System.out.println(result);

	}


}
