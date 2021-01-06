import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver intialization() {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\kunkumar12\\eclipse-workspace\\Jenkins\\chromedriver.exe");  
	   
	    // Instantiate a ChromeDriver class.       
	    return new ChromeDriver();  
	}
}
