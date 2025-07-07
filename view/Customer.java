package view;

public class Customer extends User {
      
	public String ProductName;
	
	public Customer(String userName, String password, String productName) {
		super(userName, password);
		// TODO Auto-generated constructor stub
		
		this.ProductName=productName;
		
		
	}
	
	    void Customer_output() {
		
		System.out.println("productName: " + ProductName);
	}

}


///Polymorphism 