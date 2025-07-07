package inheritence;

public class Parttimeemployee extends Employee {
	
	 public double incentives = 1500.00;

	public Parttimeemployee(int employeeId, String employeeName, double salary, int departmentCode, int employeecode) {
		super(employeeId, employeeName, salary, departmentCode, employeecode);
		
		this.incentives = incentives;
	}
     @Override
     public void displayDetails() {
    	 super.displayDetails();
    	 System.out.println("incentives :"+incentives);
     }
}
