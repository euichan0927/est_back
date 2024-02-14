package Chapter10.inherit;

public class ChildProductExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String,String> product =
			new ChildProduct<>(new Tv(),"smartTV","LG");
		product.getKind();
		product.getModel();
		product.getCompany();

	}
}
