package inheritence;

public class EmployeeMain {
	
	public static void main(String[] args) {
		/*
		 * FulltimeEmployee fulltimeEmployeeData=new
		 * FulltimeEmployee(1,"Raj",25000.00,1,25);
		 * 
		 * fulltimeEmployeeData.displayDetails();
		 */
		
		SeniorManager seniorManagerData = new SeniorManager(12, "vikas", 3000.00, 2, 25,  5.0);
		seniorManagerData.displayDetails();
		
		
	}

}
