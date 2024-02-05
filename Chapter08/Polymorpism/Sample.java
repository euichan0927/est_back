// package Chapter07.polymorpism;
//
// public class Sample {
// 	public static void main(String[] args) {
// 		Zookeeper zookeeper=new Zookeeper();
// 		Lion lion = new Lion();
// 		Tiger tiger = new Tiger();
// 		zookeeper.feed(lion);
// 		zookeeper.feed(tiger);
// 	}
// }
//
// class Animal{
// 	String name;
// }
//
// class Lion extends Animal{
//
// }
// class Tiger extends Animal{
//
// }
// class Zookeeper{
// 	void feed(Lion lion){
// 		System.out.println("feed fish");
// 	}
// 	void feed(Tiger tiger){
// 		System.out.println("feed meat");
// 	}
// }