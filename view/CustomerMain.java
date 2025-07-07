package view;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter UserName");
	 String UserName=Sc.next();
	 
	 System.out.println("Enter Password");
	 String Password=Sc.next();
	 
	 System.out.println("ProductName");
	 String Details=Sc.next();
	 
	 Customer Customer_=new Customer(UserName,Password,Details);
	 Customer_.Customer_output();
		
		
		
		
		
	}
}
