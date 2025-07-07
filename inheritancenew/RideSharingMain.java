package inheritancenew;

public class RideSharingMain {

	public class RideSharingApp {
	    public static void main(String[] args) {
	        Driver driver = new Driver("Ravi", "ravi@rides.com", "D101", "MH12AB1234", 4.8);
	        Passenger passenger = new Passenger("Sara", "sara@gmail.com", "P202", "Credit Card");
	        Admin admin = new Admin("AdminJohn", "admin@rideapp.com", "A001");

	        System.out.println("=== Driver Info ===");
	        driver.displayDriverInfo();
	        driver.acceptRide();

	        System.out.println("\n=== Passenger Info ===");
	        passenger.displayPassengerInfo();
	        passenger.requestRide();

	        System.out.println("\n=== Admin Info ===");
	        admin.displayUserInfo();
	        admin.monitorSystem();
	
	
	
}
