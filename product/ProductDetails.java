package product;

public class ProductDetails implements Product,ProductDelivery {

	@Override
	public String Data(String ProductName) {
		// TODO Auto-generated method stub
		return "Watch";
	}

	@Override
	public int Data(int ProductPrice) {
		// TODO Auto-generated method stub
		return 2000;
	}

}
