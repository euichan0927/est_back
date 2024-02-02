package Chapter07.Overloading;
// 메소드의 이름 같음
// 매개변수의 개수 또는 타입이 달라야 합니다.
public class Overloading {
	String name;
	int hour;
	double hours;
	void sleep(){
		System.out.println(this.name +"z z z . . .");
	}
	void sleep(int hour){
		System.out.println(this.name +"z z z . . . during" + hour +"hours");
	}
	void sleep(double hours){
		System.out.println(this.name +"z z z . . . during" + hours +"hours");
	}
}
