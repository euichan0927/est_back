package DailyQuiz.DailyQuiz0201;

public class Movie extends Item{
	public String director;
	public String actor;
	Movie(int id,String name, int price,String director, String actor){
		super(id,name,price);
		this.director=director;
		this.actor=actor;
	}
	public void display(){
		super.display();
		System.out.println("director = " + director);
		System.out.println("actor = " + actor);
	}

}
