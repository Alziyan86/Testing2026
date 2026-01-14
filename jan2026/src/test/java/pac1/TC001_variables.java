package pac1;

public class TC001_variables {
	private static double width=20;
	private static double height=20;
	private static double depth=10;
	private static int boxid;
	
	public static double volume() {
		double temp = 0;
		try {
		temp = width * height *depth;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return temp;
		
	}
	public static void main(String[] args) {
		System.out.println("volume:"+volume());
	}
}

