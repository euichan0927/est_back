package car;

public class CarExample {
	public static void main(String[] args) {
		Car euichan = new Car();
		euichan.printSpec();
		Car futureEuichan = new Car("911 turbo s","porsche",650,81.6,"red",true);
		futureEuichan.changeHardware(1000,100);
		futureEuichan.setSheetColor("beige");
		futureEuichan.printSpec();
		String myCarSheetColor;
		myCarSheetColor=futureEuichan.getSheetColor();
		System.out.println("myCarSheetColor = " + myCarSheetColor);
		int a=10;
		euichan.getnumber(euichan);
		System.out.println(euichan.a);
	}

}
