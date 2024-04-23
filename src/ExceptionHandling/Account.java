package ExceptionHandling;

public class Account { 
    private int balance = 5000;
    public int getBalance() {
    	return balance;
    }
    public void withdraw(int amount) {
    	if(amount>balance) {
    		throw new InsufficientFundException("Insufficient fund");
    	}
    	balance = balance-amount;
    }
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("current balance" + account.getBalance() );
		account.withdraw( 6000);
		System.out.println("balance after withdraw" + account.getBalance() );

	}

}
