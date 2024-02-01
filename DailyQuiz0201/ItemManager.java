package DailyQuiz0201;

public class ItemManager {
	public static void main(String[] args) {
		Album album = new Album(1,"아이유",100000,"박재범");
		Movie movie = new Movie(2,"범죄도시",14000,"강윤성","마동석");
		Book book = new Book(3,"자바의 정석",27000,"남궁성","9788994492032");
		album.display();
		movie.display();
		book.display();
	}
}
