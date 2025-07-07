package inheritancenew;

public class Passenger extends RideSharingApp {
	
	String paymentMethod;

	Passenger(String name, String email, String userId, String paymentMethod) {
		super(name, email, userId);
	
		  this.paymentMethod=paymentMethod;
	}

	void requestRide() {
        System.out.println(name + " is requesting a ride.");
	}
	
	  void displayPassengerInfo() {
	        displayUserInfo();
	        System.out.println("Payment Method: " + paymentMethod);
	    }
	
}
