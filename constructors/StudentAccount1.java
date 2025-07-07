package constructors;

import java.util.ArrayList;
import java.util.List;

public class StudentAccount1 {

	public static void main(String[] args) {

			
			
		    StudentAccount account1 = new StudentAccount("vikas", 1234567, 120000.00);
		    StudentAccount account2 = new StudentAccount("ram", 98765432, 180000.00);
		    StudentAccount account3 = new StudentAccount("santhosh", 12123456, 90000.00);

		        ArrayList<StudentAccount> list = new ArrayList<StudentAccount>();

		        list.add(account1);
		        list.add(account2);
		        list.add(account3);

		        for (StudentAccount data : list) {
		            System.out.println (data.Accountholdername);
		            System.out.println(data.Accountnumber);
		            System.out.println(data.Accountbalance);

	}

		
	}
}
