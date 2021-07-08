package testNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class PracticeClass {
  
	FirefoxDriver driver;
	
	@BeforeTest
  public void StartApp() {
  
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vishw\\Desktop\\Study Material\\SeleniumJar\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="OnliaLoginDataProvider")
	public void Login(String username, String password) throws InterruptedException {
		
		driver.get("https://www.onlia.ca/insurance/sign-in");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(10000);
		String ActualURL = driver.getCurrentUrl();
		Assert.assertTrue(ActualURL.contains("myaccount"), "Login Failed. Test Failed");
			
	
	}
	
	@AfterTest
	public void LogOut() {
		
		driver.quit();
		
	}
	
	@DataProvider(name="OnliaLoginDataProvider")
	public Object[][] DataProvider() {
		
		Object[][] data = new Object[4][2];
		data[0][0] = "Testemail@gmail.com";
		data[0][1] = "Password123";
		data[1][0] = "sfvfdrbd@gmail.com";
		data[1][1] = "fwirhruh5454";
		data[2][0] = "vishwpatel511@gmail.com";
		data[2][1] = "Insurance@511";
		data[3][0] = "urguwgrygyy@nrjv.ca";
		data[3][1] = "Pfafjsjfs";
		
		return data;
	}
	
}
