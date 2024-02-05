package Chapter08.inerf;

public class Adult implements Walk,Run{
	@Override
	public void walk(){
		System.out.println("성인이 걸어요");
	}
	@Override
	public void run(){
		System.out.println("성인이 뛰어요");
	}
}
