package Banque;

public class Account {
    private int balance = 100;
    
    public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
        balance -= amount;
    }
}
