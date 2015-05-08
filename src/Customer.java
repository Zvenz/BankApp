public class Customer {
	
	private String personalNumber;	
	private String name;
	private Account customerAccount = null;
	private CardList customerCards = null;
	
	public Customer(String pn, String name, Account account, CardList cardList) {
		personalNumber = pn;
		this.name = name;
		customerAccount = account;
		customerCards = cardList;
	}
	
	public Customer(String pn, String name) {
		personalNumber = pn;
		this.name = name;
		customerAccount = new Account();
	}
	
	public Account getAccount() {
		return customerAccount;
	}
	
	public void pritntCustomerInfo() {
		String details = String.format("Name : %s \n PN: %s", name, personalNumber);
		System.out.println();
		//TODO Print info on CreditCards and Account
	}
	
	public boolean addCreditCard(CreditCard card) {
		if (customerCards == null) {
			customerCards = new CardList();
			card.showCard();
		}
		return customerCards.add(card);
	} 
}