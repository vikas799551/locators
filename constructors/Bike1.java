package constructors;

import java.util.ArrayList;

public class Bike1 {

	public static void main(String[] args) {
		
		 Bike bike1 = new Bike("Pulsar", "AP05 5678", 120000.00);
	        Bike bike2 = new Bike("Royal Enfield", "TG06 9876", 180000.00);
	        Bike bike3 = new Bike("Yamaha", "PY07 3456", 90000.00);

	        ArrayList<Bike> list = new ArrayList<Bike>();

	        list.add(bike1);
	        list.add(bike2);
	        list.add(bike3);

	        for (Bike data : list) {
	            System.out.println(data.BikeModel);
	            System.out.println(data.BikeNumber);
	            System.out.println(data.Price);
	        }
	    }

	}


