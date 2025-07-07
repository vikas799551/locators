package constructors;

import java.util.ArrayList;

public class Studentinfo1 {

	public static void main(String[] args) {
		

		
		studentinfo student1 = new studentinfo(90, "ram",16);
		studentinfo student2 = new studentinfo(89, "LAXMAN", 15);
		studentinfo student3 = new studentinfo(98, "SITA",17);

	        ArrayList<studentinfo> list = new ArrayList<studentinfo>();

	        list.add(student1);
	        list.add(student2);
	        list.add(student3);

	        for (studentinfo data : list) {
	            System.out.println(data.studentID);
	            System.out.println(data.Name);
	            System.out.println(data.Age);

	        }
	}

}
