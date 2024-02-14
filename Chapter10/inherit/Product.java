package Chapter10.inherit;

public class Product<T,M> {
	public T getKind() {
		return kind;
	}

	public M getModel() {
		return model;
	}

	private T kind;
	private M model;

	public Product(T kind, M model){
		this.kind=kind;
		this.model=model;
	}

}
