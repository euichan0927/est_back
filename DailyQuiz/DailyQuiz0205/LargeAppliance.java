package DailyQuiz.DailyQuiz0205;

public class LargeAppliance extends Product{
	public LargeAppliance(String name, int price, double weight) {
		super(name, price, weight);
	}
	@Override
	public int getDiscountAmount(){
		return 0;
	}

}
