package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice2 {
	public static void main(String[] args) {
		Member member1 = new Member("김의찬","검정",26);
		Member member2 = new Member("손흥민","화이트",30);
		Member member3 = new Member("황희찬","노랑",29);
		Member member4 = new Member("조현우","빨강",31);
		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);

		List<Person> personList = new ArrayList<>();
		personList=memberList
			.stream()
			.map(member -> new Person(member.getName(), member.getAge()))
			.peek(x-> System.out.println(x.getName()+x.getAge()))
			.collect(Collectors.toList());

	}
}
