package Entities;

public class Account {
	
	public Integer number;
	public String holder;
	public Double balance;
	public Double withdrowLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrowLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrowLimit = withdrowLimit;
	}
	
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrowLimit;
	}

	public void setWithdrowLimit(Double withdrowLimit) {
		this.withdrowLimit = withdrowLimit;
	}
	
	public void deposit(Double amount) {
		System.out.println("New balance: " + (balance + amount));

	}
	
	public double withdraw(Double amount) {
		if(amount > withdrowLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		return balance - amount;
	}
	
	
	
	
	
	

}
