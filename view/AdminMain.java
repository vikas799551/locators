package view;

import java.util.Scanner;

public class AdminMain  {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter UserName");
	String UserName=sc.next();
	
	System.out.println("Enter Password");
	String Password=sc.next();
	
	System.out.println("Today Report");
	String Reports=sc.next();
	
	Admin Admin_output=new Admin(UserName,Password,Reports);
	Admin_output.Admin_output();
		
		
		
	}
}
