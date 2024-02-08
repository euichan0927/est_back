package WeeklyQuiz03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int number;
	static String name;
	static String phoneNumber;
	static String company;
	static String realationship;
	static ArrayList<Contact> contacts = new ArrayList<>();
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BusinessContact businessContact = new BusinessContact();
		PersonalContact personalContact = new PersonalContact();


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
					contacts.add(new BusinessContact(name,phoneNumber,company));
					break;
				case 2:
					System.out.print("이름을 입력하세요 :");
					name = scanner.next();
					System.out.print("전화번호를 입력하세요 :");
					phoneNumber = scanner.next();
					System.out.print("관계를 입력하세요 :");
					realationship = scanner.next();
					contacts.add(new PersonalContact(name,phoneNumber,realationship));
					break;
				case 3:
					if(contacts.isEmpty()){
						System.out.println("연락처가 비어있습니다.");
					}
					else{
						for (int i = 0; i <contacts.size() ; i++) {
							if(contacts.get(i) instanceof BusinessContact){
								System.out.println("이름: "+contacts.get(i).getName()+" ,전화번호: "+contacts.get(i).getPhoneNumber()+" ,회사명: "+((BusinessContact)contacts.get(i)).getCompany());
							}
							else if(contacts.get(i) instanceof PersonalContact){
								System.out.println("이름: "+contacts.get(i).getName()+" ,전화번호: "+contacts.get(i).getPhoneNumber()+" ,관계: "+((PersonalContact)contacts.get(i)).getRelationship());
							}
						}
					}
					break;
				case 4:
					System.out.print("검색할 이름을 입력하세요:");
					name=scanner.next();
					int count=0;
					for (int i = 0; i <contacts.size() ; i++) {
						if(((contacts.get(i)).getName()).equals(name)){
							if(contacts.get(i) instanceof BusinessContact){
								System.out.println("이름: "+contacts.get(i).getName()+" ,전화번호: "+contacts.get(i).getPhoneNumber()+" ,회사명: "+((BusinessContact)contacts.get(i)).getCompany());
							}
							else if(contacts.get(i) instanceof PersonalContact){
								System.out.println("이름: "+contacts.get(i).getName()+" ,전화번호: "+contacts.get(i).getPhoneNumber()+" ,관계: "+((PersonalContact)contacts.get(i)).getRelationship());
							}
							--count;
						}

					}
					if(count==0){
						System.out.println("연락처를 찾을 수 없습니다.");
					}
					break;
				case 5:
					System.exit(0);

			}


		}
	}
}
