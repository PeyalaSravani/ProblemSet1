package Problems;

public class prob14 {

	public static void main(String[] args) {
		int num = 100; 
		
		System.out.println("Factors of"+num+"are: ");
		for(int i = 1; i <= num; ++i){
			if(num % i == 0) {
				System.out.print(i +" ");
		}

	}

}
}