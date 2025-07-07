package amazon;

public class Booking extends Amazon {
	
	
	
	public int booking_LaptopModel;
	public double amount;

	public Booking(String e_mailId, int password, int booking_LaptopModel, double amount) {
		super(e_mailId, password);
	
		this.booking_LaptopModel=booking_LaptopModel;
		this.amount=amount;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("booking_LaptopModel :" +booking_LaptopModel);
		System.out.println( " amount :"+amount);
	}

}
