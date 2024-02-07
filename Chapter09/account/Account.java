package Chapter09.account;

public class Account {
	int money;

	public int getMoney() {
		return money;
	}

	void deposit(int money){
		this.money+=money;
	}
	void withdraw(int money) throws MoneySufficientException {
		if(this.money<money){
			throw new MoneySufficientException("잔고가 부족합니다." + (this.money-money)+ "부족함");
		}
		this.money-=money;
	}
}
