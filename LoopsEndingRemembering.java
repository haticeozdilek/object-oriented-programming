//package ex;
import java.util.Scanner;

public class LoopsEndingRemembering {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int num=0;
		int sum=0;
		int Howmanynumbers=0;
		int even=0;
		int odd=0;
		System.out.println("Type numbers:");
		
		while(true) {
			num=input.nextInt();
			if(num == -1) {
				System.out.println("Thank you and see you later!");
				break;
			}
			sum+=num;
			Howmanynumbers++;
			if(num % 2== 0) {
				even++;
			}
			else {
				odd++;
			}
			
			
		}
		 System.out.println("The sum is "+sum);
	        System.out.println("How many numbers: "+Howmanynumbers);
	        System.out.println("Average: "+ ((double)sum/Howmanynumbers));
	        System.out.println("Even numbers:"+even);
	        System.out.println("Odd numbers:"+odd);
		

	}

}
