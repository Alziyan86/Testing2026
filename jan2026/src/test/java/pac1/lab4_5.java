package pac1;
 
import java.util.HashMap;
import java.util.Scanner;
 
 
public class lab4_5 {
	public static class Employee {
	    int id;
	    String name;
	    double salary;
	    String insuranceScheme;
	
	    public Employee(int id, String name, double salary, String insuranceScheme) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.insuranceScheme = insuranceScheme;
	    }
	
	    public String toString() {
	        return id + " " + name + " " + salary + " " + insuranceScheme;
	    }
	}
    public static void main(String[] args) {
 
        HashMap<Integer, Employee> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
 
        // Add employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id, name, salary, insurance scheme: ");
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            String scheme = sc.next();
 
            map.put(id, new Employee(id, name, salary, scheme));
        }
 
        // Display based on insurance scheme
        System.out.print("Enter insurance scheme to search: ");
        String searchScheme = sc.next();
 
        System.out.println("Employees with scheme " + searchScheme + ":");
        for (Employee e : map.values()) {
            if (e.insuranceScheme.equalsIgnoreCase(searchScheme)) {
                System.out.println(e);
            }
        }
 
        // Delete employee
        System.out.print("Enter employee id to delete: ");
        int deleteId = sc.nextInt();
        map.remove(deleteId);
 
        System.out.println("Remaining Employees:");
        for (Employee e : map.values()) {
            System.out.println(e);
        }
 
        sc.close();
    }
}
