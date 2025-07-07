package hospital;

public class HospitalMain {
	
	
	    public static void main(String[] args) {
	    	
	        Doctor doc = new Doctor("Dr. Pradeep", 101, 120000, "Cardiology");
	        Nurse nurse = new Nurse("Sam", 102, 50000, "Night");
	        Receptionist recep = new Receptionist("Lavanya", 103, 40000);

	        System.out.println("=== Doctor Info ===");
	        doc.displayDoctorInfo();
	        doc.diagnosePatient();

	        System.out.println("\n=== Nurse Info ===");
	        nurse.displayNurseInfo();
	        nurse.assistDoctor();

	        System.out.println("\n=== Receptionist Info ===");
	        recep.displayReceptionistInfo();
	        recep.scheduleAppointments();

	    }
}
