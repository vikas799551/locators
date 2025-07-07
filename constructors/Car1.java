package constructors;

import java.util.ArrayList;
import java.util.List;

public class Car1 {

	public static void main(String[] args) {
		
		Car cars = new Car("Harrier","TS129090",900000.00);
		Car cars1 = new Car("Creta","AP781212",600000.00);
		Car cars2 = new Car("Ertiga","MH238989",8900000.00);
		
		List<Car>list= new ArrayList<Car>();
		
		list.add(cars);
		list.add(cars1);
		list.add(cars2);
		
		for(Car data : list) {
			System.out.println(data.CarModel);
			System.out.println(data.CarNumber);
			System.out.println(data.Price);
		}
		

	}

}
