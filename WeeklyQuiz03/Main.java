package WeeklyQuiz03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int number;
	private static String name;
	private static String phoneNumber;
	private static String company;
	private static String realationship;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		while(true){
			System.out.print("1. 비즈니스 연락처 추가\n"+"2. 개인 연락처 추가\n" + "3. 연락처 출력\n" +"4. 연락처 검색\n" +"5. 종료\n"+"메뉴를 선택해주세요 :");
			number=scanner.nextInt();
			switch (number) {
				case 1:
					System.out.print("이름을 입력하세요 :");
					name = scanner.next();
					System.out.print("전화번호를 입력하세요 :");
					phoneNumber = scanner.next();
					System.out.print("회사명을 입력하세요 :");
					company = scanner.next();
					addressBook.addContact(new BusinessContact(name,phoneNumber,company));
					break;
				case 2:
					System.out.print("이름을 입력하세요 :");
					name = scanner.next();
					System.out.print("전화번호를 입력하세요 :");
					phoneNumber = scanner.next();
					System.out.print("관계를 입력하세요 :");
					realationship = scanner.next();
					addressBook.addContact(new PersonalContact(name,phoneNumber,realationship));
					break;
				case 3:
					addressBook.displayContacts();
					break;
				case 4:
					System.out.print("검색할 이름을 입력하세요:");
					name=scanner.next();
					addressBook.searchContacts(name);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("올바른 번호를 입력해주세요(1~5)");
					break;

			}
		}
	}
}
