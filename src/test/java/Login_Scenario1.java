import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_Scenario1 {

	@Test
	public void login() {
		//Setup driver to execute
		System.setProperty("webdriver.chrome.driver", "C:/Users/Van Anh/eclipse-workspace/LoginFunction/src/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://anotepad.com/");
		
		
		//Click on Register/Login button
		WebElement btnRegisterOrLogin = driver.findElement(By.xpath("//span[text()='Register/Login']"));
		btnRegisterOrLogin.click();
		
		//Verify Access to Login page successfully
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// Enter email/password and click Login
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='loginEmail']"));
		txtEmail.sendKeys("anhle161108@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		txtPassword.sendKeys("Abc@12345");
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		btnLogin.click();
		
		//Close Browser
//		driver.close();
		
	}
}
