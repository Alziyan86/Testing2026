package pac1;
import java.util.*;
class EmployeeException extends Exception{
	String message;
	public EmployeeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
 
class SalaryValidation{
	static void checkSalary(int salary) throws EmployeeException {
		if(salary<=3000) {
			throw new EmployeeException("Salary must be greater than 3000");
		}
		System.out.println("Valid Salary"+ salary);
	}
}
 
 
public class lab3_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary = sc.nextInt();		
		SalaryValidation sv = new SalaryValidation();
		try {
			sv.checkSalary(salary);
		}catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
