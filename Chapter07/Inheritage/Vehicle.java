package Chapter07.Inheritage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
	int speed;
	boolean stop;
	String color;
	public int wheels;
	boolean onOff;

	public void setModel(String model) {
		this.model = model;
	}

	private String model;
	public String getModel() {
		return model;
	}



	public Vehicle(String model, int speed, boolean stop){
		this.model=model;
		this.speed=speed;
		this.stop=stop;
	}

	// Vehicle(){
	//
	// }
}
