package Chapter10.inherit;

public class ChildProductExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String,String> product =
			new ChildProduct<>(new Tv(),"smartTV","LG");
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println(product.getCompany());

	}
}
