package pac1;

class Box
{
	double width=10;
	double height=20;
	double depth=30;
	
	double calvolume()
	{
		return width*height*depth;
	}
}






public class TC003_Class {
 public static void main(String[] args) {
	 Box obj = new Box();
	 System.out.println(obj.calvolume());
 }
}
