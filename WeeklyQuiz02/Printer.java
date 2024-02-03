package WeeklyQuiz02;

public class Printer {
	public static void main(String[] args) {
		Sales sales = new Sales();
		Beauty beauty = new Beauty();
		sales.information(beauty);

		Grocery grocery = new Grocery();
		sales.information(grocery);

		LargeAppliance largeAppliance = new LargeAppliance();
		sales.information(largeAppliance);
	}
}
