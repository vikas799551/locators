package inheritence;

public class Employee {
	
	public int EmployeeId;
	public String EmployeeName;
	public double Salary;
	public int DepartmentCode;
	public int EmployeeCode;
	
	
	public Employee(int employeeId, String employeeName, double salary, int departmentCode, int employeecode ){
		
		this.EmployeeId = employeeId;
	    this.EmployeeName = employeeName;
	    this.Salary = salary;
	    this.DepartmentCode = departmentCode;
	    this.EmployeeCode = employeecode;
	    
	}
      
    public void displayDetails() {
    	System.out.println("EmployeeId: "+EmployeeId+",EmployeeName:"+EmployeeName+",Salary:"+Salary);
    }
	
}
