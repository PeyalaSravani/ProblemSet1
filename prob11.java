package Problems;

import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter lower and upper ranges: ");
			
			int low = sc.nextInt();
			int high = sc.nextInt();
			System.out.println("armstrong numbers between "+ low +"and"+ high+"are : ");
			
			for(int num = low;num <= high; num++)
			{
			int sum = 0, temp, digit,len;
			  
			   len = getorder(num);
			   temp = num;
			 
			   while(temp != 0)
				{
					digit = temp % 10;
					
					sum = sum + (int)Math.pow(digit, len);
					temp /= 10;
				}
				if (sum == num)
					System.out.println(num + " ");
				}
			}

		        private static int getorder(int num) {
			        int len = 0;
			        while (num!=0)
			        {
				         len++;
				         num = num/10;
				
			        }
			
			        return len;
		}


	}

