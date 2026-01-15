package pac1;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.*;
public class TC_timedate {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.Medium);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Instant currenttime= Instant.now();
		System.out.println("Current Time:"+currenttime);
		
		LocalDate now = LocalDate.now();
		LocalDate independence = LocalDate.of(1947, Month.AUGUST, 15);
		Period period = independence.until(now);
		
		
		System.out.println("Now :"+now);
		System.out.println("Independence:"+independence);
		System.out.println("Tomorrow:"+ now.plusDays(1));
		System.out.println("Last Month:"+ now.minusMonths(1));
		System.out.println("Leap Year :"+now.isLeapYear());
		System.out.println("move to 30th day of month:"+now.withDayOfMonth(30));
		
	    System.out.println("Period:"+period);
		
		
		ZonedDateTime ct = ZonedDateTime.now();
		ZonedDateTime ctinparis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("India Time:"+ct);
		System.out.println("Paris Time:"+ctinparis);
		
	}
 
}