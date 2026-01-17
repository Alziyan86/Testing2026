package pac1;
import java.util.*;
class invalidName extends Exception{
	String message ;
	public invalidName(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
class employee{
	static void validateName(String first, String last) throws invalidName {
		if(first == null || last == null || first.trim().isEmpty() ||last.trim().isEmpty() ) {
			throw new invalidName("First name and last name cannot be empty");
		}
		System.out.println("valid name:"+ first +" "+last);
		
	}
}
public class lab_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee em = new employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		try {
			em.validateName(firstName, lastName);
		} catch(invalidName e) {
			System.out.println(e.getMessage());
		}
		
	}
 
}