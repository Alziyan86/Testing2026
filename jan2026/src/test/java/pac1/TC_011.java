package pac1;
 
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
 
public class TC_011 {
 
    public static void main(String[] args) {
 
        String dob = "20/10/2004";
 
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
        LocalDate birthdate =
                LocalDate.parse(dob, formatter);
 
        LocalDate currentDate =
                LocalDate.now();
 
        Period duration =
                Period.between(birthdate, currentDate);
 
        System.out.println("Date of Birth : " + birthdate);
        System.out.println("Current Date  : " + currentDate);
        System.out.println("Duration is : "
                + duration.getYears() + " Years "
                + duration.getMonths() + " Months "
                + duration.getDays() + " Days");
    }
}
