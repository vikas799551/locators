package view;

public class User {

	public String UserName;
	public  String  Password;
	
	public User(String userName, String password) {
		
		this.UserName=userName;
		this.Password=password;
	}
	
	 void UserDisplay () {
		System.out.println("UserName:" + UserName + ",Password: " + Password );
		
		
		
	}	
	
	}
	


	
	

