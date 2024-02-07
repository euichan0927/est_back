package Chapter09.accountrollback;

import Chapter09.account.MoneySufficientException;

public class Account {
	int money;

	public Account(){
		this.money=0;
	}

	public int getMoney() {
		return money;
	}

	void deposit(int money){
		this.money+=money;
	}

	void withdraw(int money) throws MoneyInsufficientException {
		if(this.money<money){
			throw new MoneyInsufficientException("보유하신 잔고보다 송금하려는 금액이 커서 송금에 실패했습니다." + (this.money-money)+ "부족함");
		}
		this.money-=money;
	}
}
