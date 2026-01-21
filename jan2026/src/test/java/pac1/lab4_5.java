package pac1;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
//Employee class
class Employee {
 
private int id;
private String name;
private double salary;
private String designation;
private String insuranceScheme;
 
public Employee(int id, String name, double salary, String designation) {
   this.id = id;
   this.name = name;
   this.salary = salary;
   this.designation = designation;
}
 
public int getId() {
   return id;
}
 
public String getName() {
   return name;
}
 
public double getSalary() {
   return salary;
}
 
public String getDesignation() {
   return designation;
}
 
public String getInsuranceScheme() {
   return insuranceScheme;
}
 
public void setInsuranceScheme(String insuranceScheme) {
   this.insuranceScheme = insuranceScheme;
}
}
 
//Service interface
interface EmployeeService {
void findInsuranceScheme(Employee emp);
}
 
//Service implementation
class EmployeeServiceImpl implements EmployeeService {
 
@Override
public void findInsuranceScheme(Employee emp) {
 
   double salary = emp.getSalary();
   String designation = emp.getDesignation();
 
   if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
       emp.setInsuranceScheme("Scheme A");
   } else if (salary > 30000) {
       emp.setInsuranceScheme("Scheme B");
   } else if (salary > 20000) {
       emp.setInsuranceScheme("Scheme C");
   } else {
       emp.setInsuranceScheme("No Scheme");
   }
}
 
}
 
 
//Main class
public class lab2_3 {
 
 
 
public static void writeToFile(HashMap<Integer, Employee> map, String filename) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));  // overwrites the file
 
    for (Employee e : map.values()) {
        bw.write(e.getId() + ","
                + e.getName() + ","
                + e.getSalary() + ","
                + e.getDesignation() + ","
                + e.getInsuranceScheme());
        bw.newLine();
    }
 
    bw.close();   // important!
    System.out.println("File Written Successfully!");
}
 
 
public static void readFromFile(String filename) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(filename));
 
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
 
    br.close();
}
 
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<Integer, Employee> map = new HashMap<>();
 
            try {
                // 1) Input
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
 
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine().trim();
 
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
 
                System.out.print("Enter Designation: ");
                String designation = sc.nextLine().trim();
 
                // 2) Build employee & compute scheme
                Employee emp = new Employee(id, name, salary, designation);
                EmployeeServiceImpl service = new EmployeeServiceImpl();
                service.findInsuranceScheme(emp);
 
                // 3) Put in HashMap
                map.put(emp.getId(), emp);
 
                // 4) Write & Read file (CSV text)
                String file = "C:\\Users\\Mayank.2.Gupta\\git\\repository3\\Testing\\src\\Pack1\\numbers.txt";
                writeToFile(map, file);
                readFromFile(file);
 
                // 5) Filter by scheme (simple search)
                System.out.print("\nEnter scheme to search: ");
                String scheme = sc.nextLine().trim();
                System.out.println("Employees under scheme: " + scheme);
                for (Employee e : map.values()) {
                    if (e.getInsuranceScheme() != null &&
                            e.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                        System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation());
                    }
                }
 
                // 6) Delete by id and persist again (optional)
                System.out.print("\nEnter Employee ID to delete: ");
                int delId = sc.nextInt();
                if (map.remove(delId) != null) {
                    System.out.println("Deleted employee " + delId);
                } else {
                    System.out.println("No employee found with id " + delId);
                }
                writeToFile(map, file);
 
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                sc.close();
            }
        
    }
}
 
 
