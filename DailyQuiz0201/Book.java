package DailyQuiz0201;

public class Book extends Item{
	public String author;
	public String isbn;
	Book(int id, String name, int price,String author, String isbn){
		super(id,name,price);
		this.author=author;
		this.isbn=isbn;
	}
	public void display(){
		super.display();
		System.out.println("author = " + author);
		System.out.println("isbn = " + isbn);
	}
}
