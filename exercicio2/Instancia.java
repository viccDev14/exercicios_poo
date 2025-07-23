package exercicio.exercicio2;

public class Instancia {
	public static void main(String[] args) {
		
		BankAccount c1 = new BankAccount();
		c1.setAccountNumber("Vicc- 1406");
		c1.setBalance(2000);
		
		BankAccount c2 = new BankAccount("Vicc - 14026+26", 6565);
		BankAccount c3 = new BankAccount("Vicc - 1712", 1200);
		
		
		System.out.println("Numero da Conta: " + c1.getAccountNumber());
		System.out.println("Saldo: " + c1.getBalance());
		
		System.out.println("Numero da Conta: " + c2.getAccountNumber());
		System.out.println("Saldo: " + c2.getBalance());
		
		System.out.println("Numero da Conta: " + c3.getAccountNumber());
		System.out.println("Saldo: " + c3.getBalanceFormatado());
		
		System.out.print(c1.getBalance()+c3.getBalanceFormatado());
	}
}
