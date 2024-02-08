package WeeklyQuiz03;
import java.util.ArrayList;
public class AddressBook {
	ArrayList<Contact> contacts = new ArrayList<>();

	void addContact(Contact contact){
		contacts.add(contact);
	}
	void displayContacts(){
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
	}
	void searchContacts(String name){
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
	}
}
