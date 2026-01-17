package pac1;
 
import java.util.Scanner;
 
class invalidAgeException extends Exception{
	String message;
	public invalidAgeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
 
class AgeValidation{
	static void checkAge(int age) throws invalidAgeException {
		if(age<=15) {
			throw new invalidAgeException("Age must be above 15");
		}
		System.out.println("Valid age"+ age);
	}
}
public class lab3_2 {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();		
		AgeValidation av = new AgeValidation();
		try {
			av.checkAge(age);
		}catch(invalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
 
}
 