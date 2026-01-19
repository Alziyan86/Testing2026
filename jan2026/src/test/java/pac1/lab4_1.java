package pac1;
 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class lab4_1 {
	
	public static void main(String args[]) {
	
		try {
			FileReader fr = new FileReader("C:\\Users\\Alziyan.Ahmad\\git\\Testing2026\\jan2026\\src\\test\\java\\pac1\\read.txt");
		    StringBuilder sb = new StringBuilder();
			
				int ch;
				
				while ((ch = fr.read()) != -1) {
					sb.append((char) ch);
				}
				sb.reverse();
				
				FileWriter fw = new FileWriter("C:\\Users\\Alziyan.Ahmad\\git\\Testing2026\\jan2026\\src\\test\\java\\pac1\\read.txt");
				fw.write(sb.toString());
				fw.close();
				System.out.println("File content reversed successfully.");
		}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}