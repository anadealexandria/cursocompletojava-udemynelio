package Entidades;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);// Chamando o construtor da super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}

	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
