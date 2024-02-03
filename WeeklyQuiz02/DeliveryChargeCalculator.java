package WeeklyQuiz02;

public interface DeliveryChargeCalculator {
	public int getDeliveryCharge(double weight,int price);
	public String getName();
	public double getWeight();
	public int getPrice();
}
