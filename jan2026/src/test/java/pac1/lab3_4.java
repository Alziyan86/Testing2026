package pac1;
import java.util.*;
public class lab3_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of product");
		int n = sc.nextInt();
		String[] product = new String[n];
		System.out.println("Enter products");
		for(int i=0; i<n;i++) {
			product[i] = sc.nextLine();
		}
		
		Arrays.sort(product);
		System.out.println("Sorted product names");
		for(int i=0;i<product.length;i++) {
			System.out.println(product[i]);
		}
	}
 
}
