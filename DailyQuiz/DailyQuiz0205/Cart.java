package DailyQuiz.DailyQuiz0205;

public class Cart {
	Product[] products;

	public Cart(Product[] products) {
		this.products = products;
	}

	int calculateDeliveryCharge(){
		int price=0;
		double weight=0;

		for(Product product :products){
			price=price+product.price-product.getDiscountAmount();
			weight+=product.weight;
		}

		if(weight<3){
			if(price<30000) return 1000;
			else return 0;
		}
		else if(weight>=3 && weight<10){
			if(price<30000) return 5000;
			else if(price>=30000 && price<100000) return 4000;
			else return 0;
		}
		else{
			if(price<30000) return 10000;
			else if(price>=30000 && price<100000) return 9000;
			else return 0;
		}

	}
}
