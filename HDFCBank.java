package InterfaceConcept;

public class HDFCBank implements BankingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HDFCBank h=new HDFCBank();
		h.netbanking();// it's only allow the methods which is present here
		h.ATMcard();
		h.debitcard();
		
		BankingClient br=new HDFCBank();
		///br // you will get everything, whihc is present on Banking Client but you won't 
		         //access ATM Card, because this is belongs to this HDFC class
	}
	


	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		
	}
	
	public void ATMcard() {
	}
	
	

}
