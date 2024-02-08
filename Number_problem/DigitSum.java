package Number_problem;
import java.util.Scanner;

public class DigitSum {
	public void check()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number   ");
		int num = sc.nextInt();
		int Sum= 0;
		int x;
		while(num!=0)
		{
		x= num%10;					//To separate each digit...
		Sum = Sum + x;	// Sum of digits....
		num/= 10;					//To reduce the no of digit in the initial number...	
		}
		System.out.println(Sum);
		
		
	}

	public static void main(String[] args) 
	{
	
		DigitSum r = new DigitSum();
		r.check();
	
	}

}