package WeeklyQuiz03;

public class PersonalContact extends Contact{
	String relationship;
	PersonalContact(){

	}
	PersonalContact(String name, String phoneNumber, String relationship){
		super(name,phoneNumber);
		this.relationship=relationship;
	}

	public String getRelationship() {
		return relationship;
	}
}
