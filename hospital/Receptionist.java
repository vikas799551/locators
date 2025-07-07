package hospital;

public class Receptionist extends ApolloHospital {

	public Receptionist(String name, int employeeId, double salary) {
		super(name, employeeId, salary);
		
	}
	 void scheduleAppointments() {
	        System.out.println(name + " is scheduling appointments.");
	 }
	 
	 void displayReceptionistInfo() {
	        displayInfo();
	    }
}
