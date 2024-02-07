package Chapter09.accountrollback;

public class MoneyInsufficientException extends Exception{
	MoneyInsufficientException(){

	}
	MoneyInsufficientException(String message){
		super(message);
	}
}
