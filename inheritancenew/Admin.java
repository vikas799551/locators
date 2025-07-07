package inheritancenew;

public class Admin extends Passenger  {

	Admin(String name, String email, String userId, String paymentMethod) {
		super(name, email, userId, paymentMethod);
	
	}
	        
	
	}
	 @Override
	 public void displayPassengerInfo() {
		 super.displayPassengerInfo();
       System.out.println("");
	 }
}


