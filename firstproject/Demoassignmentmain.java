package firstproject;

import java.util.Scanner;

public class Demoassignmentmain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println ("Enter number_one Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter number_two Number :");
		int b =sc.nextInt();
		
		DemoAssignment demo = new DemoAssignment();
		
		int output_simple = demo.simpleassign(a, b);
		int output_add = demo.Add_Equal(a, b);
		int output_sub = demo.sub_Equal(a, b);
		int output_mul = demo.Multi_Equal(a, b);
		int output_div = demo.Div_Equal(a, b);
		int output_modul = demo.Modul_Equal(a, b);
		
		
		System.out.println("Equal a="+output_simple);
		System.out.println("Add_Equal a="+output_add);
		System.out.println("Sub_Equal a="+output_sub);
		System.out.println("Mul_Equal a="+output_mul);
		System.out.println("Div_Equal a="+output_div);
		System.out.println("Modul_Equal a="+output_modul);
		

	}

}
