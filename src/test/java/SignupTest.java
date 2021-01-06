import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignupTest {

	BaseClass base = new BaseClass();
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
	driver = base.intialization();
	}
	
	@Test
	public void signupTest() {
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void Close() {
		driver.close();
	}
	
}
