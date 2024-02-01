package DailyQuiz0201;

public class Album extends Item{
	public String artist;
	Album(int id, String name ,int price,String artist){
		super(id,name,price);	//부모 클래스의 생성자를 확인해서 생성자에 있는 코드를 그대로 가져옴.
		this.artist=artist;
	}
	public void display(){
		super.display();
		System.out.println("artist = " + artist);
	}

}
