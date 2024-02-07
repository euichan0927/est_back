package Chapter09.accountrollback;

import java.util.Scanner;

import Chapter09.account.MoneySufficientException;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account();
		Account account2= new Account();
		int setmoney;
		int outmoney;
		Scanner scanner = new Scanner(System.in);
		setmoney= scanner.nextInt();
		outmoney= scanner.nextInt();
		account.deposit(setmoney);
		try{
			account.withdraw(outmoney);
			account2.deposit(outmoney);
		} catch(MoneyInsufficientException e){
			System.out.println(e.getMessage());
		}

		System.out.println("송금자의 통장잔고 :"+ account.getMoney());
		System.out.println("피송금자의 통장잔고 :" + account2.getMoney());
	}



}
