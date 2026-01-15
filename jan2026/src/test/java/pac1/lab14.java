package pac1;


import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
 
public class lab14 {
 
    public static void printDateTimeByZone(String zoneId) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 
        System.out.println("Current Date & Time in " + zoneId + ": " + zonedDateTime.format(df));
    }
 
    public static void main(String[] args) {
        printDateTimeByZone("America/New_York");
        printDateTimeByZone("Europe/London");
        printDateTimeByZone("Asia/Tokyo");
        printDateTimeByZone("Australia/Sydney");
    }
}