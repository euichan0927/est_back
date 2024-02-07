package Chapter09.account;

public class MoneySufficientException extends Exception{
	public MoneySufficientException() {
	}
	public MoneySufficientException(String message){
		super(message);
	}
}
