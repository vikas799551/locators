package hospital;

public class Doctor extends ApolloHospital {

          String specialisation;
	     
	    public Doctor(String name, int employeeId, double salary, String specialisation) {
		super(name, employeeId, salary);
		
		 this.specialisation= specialisation;
		
	
	}

		
	    void diagnosePatient() {
	        System.out.println(name + " is diagnosing a patient.");
	    }

	    void displayDoctorInfo() {
	        displayInfo();
	        System.out.println("Specialization: " + specialisation);
	    }
	}
	

