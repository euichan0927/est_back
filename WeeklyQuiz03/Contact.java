package WeeklyQuiz03;

public abstract class Contact {
	private	String name;
	private String phoneNumber;
	Contact(){

	}
	Contact(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
