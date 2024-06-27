package Problems;

public class prob9 {

	public static void main(String[] args) {
		int num = 4327;
		int sum = 0;
		while(num!=0) {
			sum += num % 10;
			num = num / 10;
			
		}
		System.out.println("sum of digits:"+sum);
		
		
	}

}
