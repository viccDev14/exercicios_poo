package exercicio.exercicio2;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public BankAccount() {
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return  balance;
	}
	
	public String getBalanceFormatado() {
		return "R$" + balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
