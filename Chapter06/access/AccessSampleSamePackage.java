package Chapter06.access;

// 같은 패키지에 존재하는 클래스들 끼리는 private를 제외하고 모두 접근이 가능함.
public class AccessSampleSamePackage {
	public static void main(String[] args) {
		AccessSample accessSample = new AccessSample();
		System.out.println(accessSample.number2);	//defalut
		System.out.println(accessSample.number3);	//protected
		System.out.println(accessSample.number4);	//public
	}
}
