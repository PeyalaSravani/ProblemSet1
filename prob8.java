package Problems;

public class prob8 {

	public static void main(String[] args) {
		int number = 451, originalNumber, remainder, result=0;
	    originalNumber = number;
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number);
		System.out.println(number + "is an Armstrong number");

	}

}
