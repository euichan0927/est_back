package WeeklyQuiz02;

public class Sales {
	public void information(DeliveryChargeCalculator deliveryChargeCalculator){
		System.out.println("This "+deliveryChargeCalculator.getName() +" product's shipment cost is " + deliveryChargeCalculator.getDeliveryCharge(deliveryChargeCalculator.getWeight(),deliveryChargeCalculator.getPrice())+" won");
	}
}
