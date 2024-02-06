package Chapter09.Login;

public class WrongPasswordException extends Exception{
	public WrongPasswordException(){

	}
	public WrongPasswordException(String message){
		super(message);
	}
}
