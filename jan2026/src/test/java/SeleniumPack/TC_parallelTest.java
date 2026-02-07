package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_parallelTest {
  
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		
		 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		
			WebDriverManager.firefoxdriver().setup();;
			driver=new FirefoxDriver();
	}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
		
			WebDriverManager.edgedriver().setup();
			   driver=new EdgeDriver();
	}
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
  public void test1() {
	 WebDriverManager.chromedriver()
.setup();
	WebDriver dr = new ChromeDriver ();
	dr.get("https://www.amazon.com/");
	dr.quit();
  }
  @Test
  
  public void test2() {
	  WebDriverManager.edgedriver()
	  .setup();
	  	WebDriver dr = new EdgeDriver ();
	  	dr.get("https://www.flipkart.com/");
	  	dr.quit();
  }
  @Test
  public void test3() {
	  WebDriverManager.chromedriver()
	  .setup();
	  	WebDriver dr = new ChromeDriver ();
	  	dr.get("https://www.myntra.com/");
	  	dr.quit();
  }
}
