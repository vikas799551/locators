package inheritancenew;

public class RideSharingApp {

	
	  String name;
	    String email;
	    String userId;

	    RideSharingApp(String name, String email, String userId) {
	        this.name = name;
	        this.email = email;
	        this.userId = userId;
	    }

	    void displayUserInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("User ID: " + userId);
}

}