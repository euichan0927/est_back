package Chapter09.Login;

public class NotExistsIdException extends Exception{
	public NotExistsIdException(){

	}
	public NotExistsIdException(String message){
		super(message);
	}
}
