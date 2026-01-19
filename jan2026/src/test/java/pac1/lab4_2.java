package pac1;
 
import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
 
public class lab4_2 {
 
	public static void main(String[] args) throws IOException {
		
FileInputStream fis=new FileInputStream("C:\\Users\\Alziyan.Ahmad\\git\\Testing2026\\jan2026\\src\\test\\java\\pac1\\read.txt");
		
int data;
while((data=fis.read())!=-1)
{
	if (data%2==0 && (char)data!=',')
	System.out.print((char)data);
}
 
fis.close();
		
		
		
		}
 
		
 
	}
 