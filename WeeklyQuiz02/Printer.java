package WeeklyQuiz02;

public class Printer {
	public static void main(String[] args) {
		Sales sales = new Sales();
		Beauty beauty = new Beauty("Toner",7000,0.1);
		sales.information(beauty);

		Grocery grocery = new Grocery("닭가슴살10팩",35000,1.2);
		sales.information(grocery);

		LargeAppliance largeAppliance = new LargeAppliance("냉장고",99000,11.0);
		sales.information(largeAppliance);
	}
}
