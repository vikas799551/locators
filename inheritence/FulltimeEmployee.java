package inheritence;

public class FulltimeEmployee extends Employee {

      public double bonus=2000.00;
	public FulltimeEmployee(int employeeId, String employeeName, double salary, int departmentCode, int employeecode) {
		super(employeeId, employeeName, salary, departmentCode, employeecode);
		
		this.bonus=bonus;
	}
	
	
	@Override 
	public void displayDetails() {

		super.displayDetails();
		System.out.println("Bonus :"+bonus);
	}
	
	}
