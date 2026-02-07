package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PT2 {
  @Test
  public void Test_4() {
	  WebDriverManager.chromedriver()
	  .setup();
	  	WebDriver dr = new ChromeDriver ();
	  	dr.get("https://www.youtube.com/");
	  	dr.quit();
  }
  
}
