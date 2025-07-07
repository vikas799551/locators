package firstproject;

import java.util.Scanner;

public class Demomain {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter number_one Number" );
	      short short_a = sc.nextShort();
		 
		 System.out.println("Enter number = two Number");
		 short short_b  = sc.nextShort();
		 
		 Demo demo = new Demo();
		 
		short output_add = demo.add(short_b, short_b);
		 
		short output_sub = demo.sub(output_add, short_b);
		 
		short output_mul = demo.mul(output_sub, output_add);
		 
		short output_div = demo.div(short_b, short_b);
		 
		short output_modul = demo.modu(short_b, short_b);
		 
		System.out.println(output_add);
		System.out.println(output_sub);
		System.out.println(output_mul);
		System.out.println(output_div);
		System.out.println( output_modul);
		
		
	}

}
