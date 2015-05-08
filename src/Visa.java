public class Visa extends CreditCard{
	
	public Visa (String n, String t, Account acc) {
		super(n, t, acc);
		
	}
	public boolean makePayment(double money) {
		System.out.println("Trying to make payment "+money);
		return customerAccount.withdrawMoney(0.98 * money);
	}
}