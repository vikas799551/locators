package view;

public class Admin extends User {
	
      public String Reports;
	public Admin(String userName, String password, String reports) {
		super(userName, password);
		// TODO Auto-generated constructor stub
		this.Reports=reports;
	}
      
	public void Admin_output() {
		System.out.println("Reports :"+Reports);
		
		
	}
	
	
}
