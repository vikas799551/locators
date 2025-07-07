package amazon;

public class Amazon {
	
	public String E_mailId;
	public int  Password;
	
	public  Amazon(String e_mailId, int password) {
		
		this.E_mailId = e_mailId;
		this.Password = password;
		
	}
	
	public void displayDetails() {
		System.out.println("E_mailId :" +E_mailId+ ",Password :"+Password);
		
	}

}
