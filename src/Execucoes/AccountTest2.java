package Execucoes;

import Entidades.Account;
import Entidades.SavingsAccount;

public class AccountTest2 {

	public static void main(String[] args) {
		
		Account x = new Account(1005, "Ana", 1000.00);
		Account y = new SavingsAccount(1020, "Bart", 1000.00, 0.01);
		
		x.withdraw(200.00);
		y.withdraw(200.00);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
