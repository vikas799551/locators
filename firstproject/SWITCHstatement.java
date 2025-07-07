package firstproject;

public class SWITCHstatement {

	public static void main(String[] args) {
		
int age = 60;
        
        // Outer switch for age group
        switch (age / 10) {
            case 0: // Age between 0-9
                System.out.println("Child");
                break;
            case 1: // Age between 10-19
                System.out.println("Teenager");
                break;
            case 2: // Age between 20-29
                System.out.println("Young Adult");
                break;
            case 3: // Age between 30-39
            case 4: // Age between 40-49
                System.out.println("Adult");
                break;
            default:
                System.out.println("Senior");
        }
	}

}
