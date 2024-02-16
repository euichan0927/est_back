package Chapter11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "qwer");
		map.put("sumer", "qwer1234");
		map.put("fall", "qwer123");
		map.put("winter", "qwe123");

		Scanner scanner = new Scanner(System.in);    // 키보드로 부터 입력된 내용을 받기 위해 생성
		while(true){
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 :");
			String id = scanner.next();
			System.out.println("비밀번호 :");
			String password = scanner.next();
			System.out.println();
			if(map.containsKey(id)){
				if(map.get(id).equals(password)){
					System.out.println("로그인 성공");
					break;
				}
				else{
					System.out.println("비밀번호 오류");
				}
			}
			else{
				System.out.println("등록된 아이디가 없습니다.");
			}

		}
	}
}
