package inheritancenew;

public class Driver extends RideSharingApp {
	
	public String vehicleNumber;
	double rating;

	Driver(String name, String email, String userId, String vehicleNumber,double rating) {
		super(name, email, userId);
		
		this.vehicleNumber=vehicleNumber;
		this.rating=rating;
	}
	 void acceptRide() {
	        System.out.println(name + " is accepting a ride request.");
	 }
	 
	  void displayDriverInfo() {
	        displayUserInfo();
	        System.out.println("Vehicle Number: " + vehicleNumber);
	        System.out.println("Rating: " + rating);
	    }

}
