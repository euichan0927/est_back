package Chapter06.access2;

import Chapter06.access.AccessSample;
// 다른 패키지에 존재하는 클래스에 접근할 때 public에만 접근 가능함.
public class AccessSamplePrint {
	public static void main(String[] args) {
		AccessSample accessSample = new AccessSample();
		System.out.println(accessSample.number4);	//public인 필드에만 접근 가능
		// accessSample.number3;         -> 오류 발생
		accessSample.setNumber2(-100);
		System.out.println(accessSample.getNumber2()); //getter생성으로 default 필드에 접근 가능
		System.out.println(accessSample.getNumber());	//getter 생성으로 private 필드에 접근 가능

	}
}
