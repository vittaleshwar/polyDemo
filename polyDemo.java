package dec28;
class Bank {
	int balance;
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("successfully deposited.....amount..." + amt);
	}
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println(" successfully withdrawn.....amount..." + amt);
	}
	
	void checkBalance() {
		System.out.println(" avl balance....." + this.balance);
	}

	
}
class CanaraBank extends Bank {
	public CanaraBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("From CanaraBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("From CanaraBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("FROm CanaraBank avl balance....." + this.balance);
	}
}
class KotakBank extends Bank {
	public KotakBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("From KotakBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("From KotakBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("FROm KotakBank avl balance....." + this.balance);
	}
}

class YesBank extends Bank {
	public YesBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("From YesBank successfully deposited.....amount..." + amt);

		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 500000) {
			this.balance = this.balance - amt;
			System.out.println("From YesBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("FROm YesBank avl balance....." + this.balance);
	}
}

public class polyDemo {
public static void main(String[] args) {
		
		Bank bank= null;
	
		bank = new CanaraBank(10000);
		
		
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		
		
		bank =  new KotakBank(75000);
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		
		bank = new YesBank(85000);
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		

	

	}

}
