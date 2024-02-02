package Chapter07.Inheritage;

public class Motorcycle extends Vehicle{
	public Motorcycle(String model, int speed, boolean stop){
		//super();
		super(model,speed,stop);

	}

	public static void main(String[] args) {
		Motorcycle motorcycle = new Motorcycle("g63 amg",500,false);
		System.out.println("model=" + motorcycle.getModel() + "speed =" + motorcycle.speed);
		motorcycle.setModel("porsche tycan");
		System.out.println(motorcycle.getModel());
	}
}
