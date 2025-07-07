package inheritancenew;

public class AddBalance extends Banking {
	
	public int AddBalances;
	
	public AddBalance(String accountHolderName, int accountNumber, int ifscCode, String branch, int balance,int addBalances) {
		super(accountHolderName, accountNumber, ifscCode, branch, balance);
	
		this.AddBalances=addBalances;
		
	}
	   @Override
        public void displayDetails() {
        	super.displayDetails();
           System.out.println("AddBalances:"+ AddBalances);       
           
        
        }
	
	
}
