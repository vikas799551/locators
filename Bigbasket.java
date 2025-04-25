package swiggy;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		String str_Title = driver.getTitle();
		System.out.println(str_Title);

		WebElement Locationbutton= driver.findElement(By.id("headlessui-menu-button-:r8:"));
		String myClick = Locationbutton.toString();
		Locationbutton.click();
	    System.out.println(myClick);
		Thread.sleep(1000);
		driver.quit();
		
		
		

	}

}
