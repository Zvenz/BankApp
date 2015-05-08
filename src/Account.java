import java.math.BigInteger;
import java.util.Random;

public class Account {
	
	private long accountNumber;
	private double amount = 0;
	
	public double getAmount() {
		return amount;
	}
	public void addMoney(double money) {
		amount = amount + money;
	}
	public boolean withdrawMoney(double money) {
		if (amount < money) {
			System.out.println("There is not enough money");
			return false;
		}
		amount = amount - money;
		System.out.println("Payment successed");
		return true;
		
	}
	
	public Account() {
		BigInteger b = new BigInteger(256, new Random());
		accountNumber = Math.abs(b.longValue());
		System.out.println("Account: "+accountNumber);
	}
}