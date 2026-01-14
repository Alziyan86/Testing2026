
package pac1;
import java.util.*;
public class TC010 {
  public static boolean StringIsPositive(String str) {
	  String sb = str.toUpperCase();
	  if(str.length() == 0) return true;
	   
	  
	 for(int i=0;i<str.length()-1;i++) {
		 if(str.charAt(i) > str.charAt(i+1)) return false;
	 }
	 return true;
  }
  public static void main(String args[]) {
	  String str = "apple";
	  
	  System.out.println(StringIsPositive(str));
  }
}
 