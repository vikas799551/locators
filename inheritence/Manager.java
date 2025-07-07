package inheritence;

public class Manager extends FulltimeEmployee {
	
	 double noofYearsExperience ;

	public Manager(int employeeId, String employeeName, double salary, int departmentCode, int employeecode, double noofYearsExperience) {
		super(employeeId, employeeName, salary, departmentCode, employeecode);
		
		this.noofYearsExperience = noofYearsExperience; 
		// TODO Auto-generated constructor stub
	}
	
	    @Override
	    public void displayDetails() {
	    	super.displayDetails();
	    	System.out.println("no of Years Experience" +noofYearsExperience );
	    }
	    

	

}
