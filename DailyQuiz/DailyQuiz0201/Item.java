package DailyQuiz.DailyQuiz0201;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Item {
	public int id;
	public String name;
	public int price;

	public Item(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void display(){
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}
}
