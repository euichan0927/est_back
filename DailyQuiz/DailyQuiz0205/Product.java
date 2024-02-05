package DailyQuiz.DailyQuiz0205;

public class Product implements Promotion{
	String name;
	int price;
	double weight;

	public Product(String name, int price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	@Override
	public int getDiscountAmount() {
		return 0;
	}
}
