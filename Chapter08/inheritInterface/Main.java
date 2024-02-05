package Chapter08.inheritInterface;

public class Main {
	public static void main(String[] args) {
		InterfaceCImpl cimpl = new InterfaceCImpl();
		InterfaceA interA = new InterfaceCImpl();
		interA.methodA();
		cimpl.methodC();
	}
}
