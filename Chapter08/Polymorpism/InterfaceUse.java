package Chapter08.Polymorpism;

public class InterfaceUse {
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		zookeeper.feed(tiger);

		Lion lion = new Lion();
		zookeeper.feed(lion);
	}
}
interface Predator{
	String getFood();
}

class Animal{
	String name;
}

class Tiger extends Animal implements Predator{
	public String getFood(){
		return "meat";
	}
}
class Lion extends Animal implements Predator{
	public String getFood(){
		return "fish";
	}
}
class Zookeeper{
	void feed(Predator predator){
		System.out.println("feed " + predator.getFood());
	}
}
