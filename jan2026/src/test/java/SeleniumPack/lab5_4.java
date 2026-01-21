package SeleniumPack;
 
import java.util.Scanner;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class lab5_4 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		
		System.out.println("Enter First Name");
		String Fname = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys(Fname);
		
		//Last Name
		System.out.println("Enter Last Name");
		String Lname = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input")).sendKeys(Lname);
		//Email
		System.out.println("Enter Email");
		String Email = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input")).sendKeys(Email);
		
		//Telephone
		System.out.println("Enter Telephone");
		String Tphn = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input")).sendKeys(Tphn);
		
		//Password
		System.out.println("Enter Password");
		String Pass = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")).sendKeys(Pass);
		
		//Confirm Password
		//System.out.println("Confirm Password");
		//String CPass = sc.nextLine();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input")).sendKeys(Pass);
		
		//Newsletter
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		if(Fname.length()<32) {
			System.out.println("valid");
		}
 
		else {
			String msg = driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div")).getText();
			System.out.println("Error is : "+msg);
		}
		
		if (Lname.length()<32) {
			System.out.println("Valid");
		}
		else {
			String msg2= driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).getText();
		System.out.println("Error is: " +msg2);	
		}
 
		if(Tphn.length()>=3 && Tphn.length()<=32) {
			System.out.println("Valid");
		}
		else {
 
			String phonerror= driver.findElement(By.xpath("//*[@id=\"account\"]/div[5]/div/div")).getText();
		    System.out.println("Error is: " + phonerror);	
		}
		
		if(Pass.length()<=20 && Pass.length()>=4 ) {
			System.out.println("valid");
		}
 
		else {
			String msg = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/fieldset[2]/div[1]/div/div")).getText();
			System.out.println("Error is : "+msg);
		
		}
		String confirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"	)).getText();
		System.out.println(confirm);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();
 
	}
}