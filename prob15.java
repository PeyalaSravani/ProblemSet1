package Problems;

public class prob15 {

	public static void main(String[] args) {
		int num = 5;
		int a = 0, b = 1;
		
		
		   System.out.println(a + "," + b + ",");
		   
		   int nextterm;
		   
		   
		   for (int i =2;i < num;i++)
		   {
			   nextterm = a + b;
			   a = b;
			   b = nextterm;
			   System.out.println(nextterm + ",");
		   }
		

	}

}

