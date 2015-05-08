public class CardList { 
	private CreditCard[] thecards = new CreditCard[3];
	
	public boolean add(CreditCard c){
		int i = 1;
		boolean freeSlot = false;
		while (i < thecards.length && !freeSlot)
			if(thecards[i] == null){
				thecards[i]=c;
				freeSlot = true;
				}
			else {
				i++;
			}
		if (i < thecards.length) {
			System.out.println("Card(s) in wallet: "+i);
			return false;
		}
		    System.out.println("No space left for new cards");
		return true;
	}
	
	public void printCards() {
		for (int i=0; i < thecards.length; i++) {
			if (thecards[i] != null) {
				System.out.println("Card: ");
			}
		}
	}
}