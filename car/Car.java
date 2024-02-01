package car;

public class Car {
	String name;
	String brandName;
	double horsePower;
	double torque;
	String sheetColor;
	boolean heatedSeat;
	int a=10;


	public Car() {
		this.name="sonata";
		this.brandName="hyundai";
		this.horsePower=143;
		this.torque=265;
		this.sheetColor="black";
		this.heatedSeat=false;
	}

	public Car(String name, String brandName, double horsePower, double torque, String sheetColor,boolean heatedSeat) {
		this.name = name;
		this.brandName=brandName;
		this.horsePower=horsePower;
		this.torque = torque;
		this.sheetColor = sheetColor;
		this.heatedSeat = heatedSeat;
	}

	public void printSpec() {
		System.out.println("\nCar Imformation \n" +"\nbrand :" +brandName + "\nname :" + name + "\nhorsePower :" + horsePower + "\ntorque :" + torque +"\nsheetColor :" +sheetColor +"\nheatedSeat :" +heatedSeat);
	}

	public void changeSoftware(String sheetColor, boolean heatedSeat) {
		this.sheetColor=sheetColor;
		this.heatedSeat=heatedSeat;
	}
	public void changeHardware(double horsePower, double torque) {
		this.horsePower =horsePower;
		this.torque=torque;
	}
	void setSheetColor(String sheetColor){
		this.sheetColor=sheetColor;
	}
	String getSheetColor(){
		return this.sheetColor;
	}
	void getnumber(Car euichan){
		euichan.a++;

	}
	public static void main(String[] args) {
		Car porsche = new Car("911 turbo s","porsche",650,81.6,"red",true);
		porsche.printSpec();

		porsche.changeSoftware("yellow",false);
		porsche.changeHardware(1000,100);
		porsche.printSpec();

		Car sonata = new Car();
		sonata.printSpec();



	}

}
