
package pac1;
import java.util.*;
public class TC009_4q {
   public static String performOperation(String str, int choice) {
	   StringBuffer sb = new StringBuffer(str);
	   switch(choice) {
	   case 1:
		   sb.append(str);
		   return sb.toString();
	   case 2:
		   for(int i=0;i< sb.length(); i++) {
			   if(i % 2 != 0) {
			   sb.setCharAt(i, '#');
		   }
	   }
	   case 3:
		   StringBuffer result = new StringBuffer();
		   for(int i=0; i< sb.length(); i++) {
			   char ch = sb.charAt(i);
			   if(result.indexOf(String.valueOf(ch)) == -1) {
				   result.append(ch);
			   }
		   }
		   return result.toString();
	   case 4:
		   for(int i=0; i<sb.length(); i++) {
			   if(i % 2 != 0) {
				   sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
		
			   }
		   }
		   return sb.toString();
		   
		   default:
			   return "Invalid Choice";
   }
}
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter String :");
	   String str = sc.nextLine();
	   
	   System.out.println("1. Add String to self");
	   System.out.println("2. Replace odd positions with #");
	   System.out.println("3. Remove duplicate characters");
	   System.out.println("4. Change odd characters to upper case");
	   
	   System.out.print("Enter choice :");
	   int choice = sc.nextInt();
	   
	   String output = performOperation(str,choice);
	   System.out.println("Result:" + output);
   }
}
 
 