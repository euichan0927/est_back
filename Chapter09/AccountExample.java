package Chapter09;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(30000);
		System.out.println("예금액 :" + account.getMoney());

		try{
			account.withdraw(100000);
			System.out.println("출금 후 :"+account.getMoney());
		}catch (MoneySufficientException e){
			System.out.println(e.getMessage());
		}
	}
}
