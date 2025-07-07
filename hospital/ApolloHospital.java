package hospital;

public class ApolloHospital {


	    String name;
	    int employeeId;
	    double salary;

	  public  ApolloHospital (String name, int employeeId, double salary) {
		  
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: $" + salary);
	    }
	}

	

