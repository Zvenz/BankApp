abstract public class CreditCard {
	
	public String number;
	public String type;
	public Account customerAccount;
	
	
	
	public void showCard(){
		System.out.println("Number: "+number);
		System.out.println("Type: "+type);
	}
	
	public CreditCard(String n, String t, Account acc) {
		number = n;
		type = t;
		customerAccount = acc;
		//TODO implement
	}
	public abstract boolean makePayment(double amount);
}