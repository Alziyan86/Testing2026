package SeleniumPack;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import java.time.Duration;
import java.util.*;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_PersonalDetails {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://www.amazon.com");
        
        WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(15));
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("a")));
        List<WebElement>links = dr.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link:links) {
        	String text = link.getText();
        	String href = link.getAttribute("href");
        	
        			if (href!= null && !href.isEmpty()) {
        				System.out.println(text + "->" + href);
        			}
        //	System.out.println(link.getAttribute("a"));
        
        }
    
	}
 
}