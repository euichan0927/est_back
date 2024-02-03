package WeeklyQuiz02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beauty extends Product implements DeliveryChargeCalculator{
	String name="Toner";
	int price = 7000;
	double weight = 0.1;

	@Override
	public int getDeliveryCharge(double weight,int price){
		if(weight<3){
			if(price<30000) return 1000;
			else return 0;
		}
		else if(weight>3 && weight<10){
			if(price<30000) return 5000;
			else if(price>30000 && price<100000) return 4000;
			else return 0;
		}
		else{
			if(price<30000) return 10000;
			else if(price>30000 && price<100000) return 9000;
			else return 0;
		}
	}
	@Override
	public String getName() {return this.name;}
	@Override
	public double getWeight() {return this.weight;}
	@Override
	public int getPrice() {return this.price;}
}
