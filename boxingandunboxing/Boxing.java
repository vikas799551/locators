package boxingandunboxing;

public class Boxing {
	
	public static void main (String[] args) {
		
		int i = 20;
		Integer integer = Integer.valueOf(i);
		System.out.println("Integer : " +integer);
		
		char c= 'c';
		Character character = Character.valueOf(c);
		System.out.println("Character :"+character);
		
		byte b = 9;
		Byte bytes = Byte.valueOf(b);
		System.out.println("Byte :"+bytes);
		
		short S = 890;
		Short shorts = Short.valueOf(S);
		System.out.println("Short :"+shorts);
		
		long L = 79955152;
		Long longer = Long.valueOf(L);
		System.out.println("Long :"+longer);
		
		float F = 123456f;
		Float floats = Float.valueOf(F);
		System.out.println("Float : "+ floats);
		
		double D = 1232344d;
		Double doubles = Double.valueOf(D);
		System.out.println("Double :"+doubles);
		
		boolean Bool = true;
		Boolean booleans = Boolean.valueOf(Bool);
		System.out.println("Boolean :"+booleans);
		
		String str_value = "890";
		Integer  string_value = integer.valueOf(str_value);
		System.out.println(str_value);
		
		String strin_value = "120";
		Byte stri_value = bytes.valueOf(strin_value);
		System.out.println(strin_value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
