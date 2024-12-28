class RBIbank {
	int balance;
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From RBI bsuccessfully deposited....amount..." + amt);
		
	}
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From RBI successfully withdrawan...amount..." + amt);
		
	}
	void checkBalance() {
		System.out.println("From RBI avl balance...." + this.balance);
		
	}
}
class SBIBank extends RBIBank {
	private Object balance;
	public SBIBank(int balance) {
		this.balance = balance;
		
	}
	void deposit(int amt) {
		if(amt < 5000) {
			this.balance = this.balance + amt;
			System.out.println("From SBI successfully deposited... amount.." + amt);
			
		} else {
			System.out.println("From SBI day limit exceeds");
		}
	}
	
}
class RBIbank {
	int balance;
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From RBI bsuccessfully deposited....amount..." + amt);
		
	}
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From RBI successfully withdrawan...amount..." + amt);
		
	}
	void checkBalance() {
		System.out.println("From RBI avl balance...." + this.balance);
		
	}
}
class ICICIBank extends ICICIBank {
	private int balance;
	public ICICIBank(int balance) {
		this.balance = balance;
		
	}
	void deposit(int amt) {
		if(amt < 20000) {
			this.balance = this.balance + amt;
			System.out.println("From ICICI successfully deposited... amount.." + amt);
			
		} else {
			System.out.println("From ICICI day limit exceeds");
		}
	}
	
}

package dec28;

public class test {

}
