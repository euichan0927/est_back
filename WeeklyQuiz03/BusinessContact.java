package WeeklyQuiz03;

public class BusinessContact extends Contact{
	String company;
	BusinessContact(){

	}
	BusinessContact(String name, String phoneNumber,String company){
		super(name,phoneNumber);
		this.company=company;
	}

	public String getCompany() {
		return company;
	}
}
