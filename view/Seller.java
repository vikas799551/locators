package view;

public class Seller extends User {
	
      public String OrderedProduct;
	public Seller(String userName, String password, String OrderedProduct) {
		super(userName, password);
		// TODO Auto-generated constructor stub
		this.OrderedProduct=OrderedProduct;
	}

	public void Seller_() 
	{
		
		System.out.println("OrderedProduct : "+OrderedProduct);
	}
}
