package constructors;

import java.util.ArrayList;
import java.util.List;

public class Person1 {

	public static void main(String[] args) {
		
		  Person student1=new Person("vikas", 58, 60);
		    Person student2=new Person("ram", 52, 70);
		    Person student3=new Person("laxman",65, 80);

		   System.out.println(student1);
		    
		        List<Person> list = new ArrayList<Person>();

		        list.add(student1);
		        list.add(student2);
		        list.add(student3);

		        for (Person data:list) {
		            System.out.println(data.Name); 
		            System.out.println(data.Height);
		            System.out.println(data.Weight);

	}

}
}
