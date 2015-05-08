public class MasterCard extends CreditCard{
	
	public MasterCard(String n, String t, Account acc) {
		super(n, t, acc);
		
	}
	public boolean makePayment(double money) {
		System.out.println(money);
		return customerAccount.withdrawMoney(money);
	}
}