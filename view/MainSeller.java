package view;

import java.util.Scanner;

public class MainSeller {

	

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter UserName : ");
		String UserName=Sc.next();
		
		System.out.println("Enter Password : ");
		String Password=Sc.next();
		
		System.out.println("Enter ReceivedOrder");
		String OrderedProduct=Sc.next();
		
		Seller Seller_=new Seller(UserName,Password,OrderedProduct);
		Seller_.Seller_();
		
	}
	
}
