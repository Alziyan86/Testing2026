package pac1;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
 
public class lab12 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day");
		int day = sc.nextInt();
		System.out.println("Enter year");
		int year1 = sc.nextInt();
		System.out.println("Enter month");
		int month1 = sc.nextInt();
		System.out.println("Enter day");
		int day1 = sc.nextInt();
 
		LocalDate gd = LocalDate.of(year, month, day);
		LocalDate gd2 = LocalDate.of(year1, month1, day1);
 
		Period period =  Period.between(gd,gd2);
		System.out.println("Its been " + period);
 
 
	}
}