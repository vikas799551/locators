package interface2;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter interdata = new Inter();
		System.out.println();
		System.out.println("Studentname : "+interdata.Getdata_One( "Vikas"));
		System.out.println("StudentID :   "+interdata.Getdata_two(1123));
		System.out.println("StudentGrade :"+interdata.Getdata_three('A'));
		System.out.println("StudentTotalMarks :"+interdata.Getdata(900));
		
		
		
		
		
	}

}
