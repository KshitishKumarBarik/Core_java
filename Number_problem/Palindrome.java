package Number_problem;
import java.util.Scanner;

public class Reverse {
	public static void check( int num)
	{
		int num1= num;
		int reverse= 0;
		int x;
		while(num!=0)
		{
		x= num%10;					//To separate each digit...
		reverse = reverse*10 + x;	//Form a Reverse number...
		num/= 10;					//To reduce the no of digit in the initial number...	
		}
		System.out.println(reverse);
		if(num1==reverse)
		{
			System.out.println("It is a palindrome  Number");
		}
		else
		{
			System.out.println("It is not a palindrome Number...");
		}
		
		 
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number   ");
		int num = sc.nextInt();
		
		check(num);

		sc.close();
	}
	
}
