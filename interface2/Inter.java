package interface2;

public class Inter implements Interfacetwo,Interfacedemo {

	@Override
	public String Getdata_One(String Studentname) {
		// TODO Auto-generated method stub
		return Studentname;
	}

	@Override
	public int Getdata_two(int Studentid) {
		// TODO Auto-generated method stub
		return Studentid;
	}

	@Override
	public char Getdata_three(char studentGrade) {
		// TODO Auto-generated method stub
		return studentGrade;
	}

	@Override
	public int Getdata(int studenttotalmarks) {
		// TODO Auto-generated method stub
		return studenttotalmarks;
	}

	
}
