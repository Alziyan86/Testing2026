package SeleniumPack;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 

public class TC_Partiallink {
	
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.partialLinkText("Regist")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).clear();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(Keys.CONTROL+"a");
		driver.close();
	}
}
