package pac1;
 
import java.time.LocalDate;
import java.util.Scanner;
 
public class lab13 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day");
		int day = sc.nextInt();
		
		
		LocalDate gd = LocalDate.of(year, month, day);
		
		System.out.println("Enter years of Warranty");
 
		
		int wyrs = sc.nextInt();
		LocalDate result = gd.plusYears(wyrs);
		
		System.out.println("Warrent is expyring on: " + result);
		
		
 
	}
 
}