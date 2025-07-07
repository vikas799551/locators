package hospital;

public class Nurse extends ApolloHospital {
	
	    String shift;

	public Nurse(String name, int employeeId, double salary,String shift) {
		super(name, employeeId, salary);
		
		this.shift=shift;
	}

	 void assistDoctor() {
	        System.out.println(name + " is assisting the doctor.");
	 }
	
	  void displayNurseInfo() {
	        displayInfo();
	        System.out.println("Shift: " + shift);
	 
	 }
}
