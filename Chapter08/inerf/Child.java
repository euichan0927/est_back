package Chapter08.inerf;

public class Child implements Walk,Run{
	@Override
	public void walk(){
		System.out.println("아이가 걸어요");
	}
	@Override
	public void run(){
		System.out.println("아이가 뛰어요");
	}
}
