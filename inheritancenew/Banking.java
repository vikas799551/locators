package inheritancenew;

public class Banking {
	
	public String AccountHolderName;
	public int    AccountNumber;
	public int IfscCode;
	public String Branch;
	public int Balance;
	
	public Banking(String accountHolderName, int accountNumber, int ifscCode, String branch, int balance ) {
		
		       this.AccountHolderName = accountHolderName;
		       this.AccountNumber = accountNumber;
		       this.IfscCode = ifscCode;
		       this.Branch = branch;
		       this.Balance = balance;
	}
             public void displayDetails() {
            	 System.out.println("AccountHolderName :"+AccountHolderName+ ",AccountNumber :"+AccountNumber+",IfscCode :"+IfscCode+",Branch:"+Branch+ ",Balance+"+Balance );
            	 	
             }
	
	
}
