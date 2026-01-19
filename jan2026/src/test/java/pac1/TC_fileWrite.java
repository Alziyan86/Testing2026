package pac1;
 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class TC_fileWrite {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text:");
		
		String text=sc.nextLine();
		FileWriter fw=new FileWriter("C:\\Users\\Alziyan.Ahmad\\git\\Testing2026\\jan2026\\src\\test\\java\\pac1\\read.txt");
		fw.write(text);
		fw.close();
		
 
	}
 
}
 
