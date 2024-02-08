package Number_problem;
import java.util.Scanner;

public class Reverse {
	public void check()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number to Reverse it ");
		int num = sc.nextInt();
		int reverse= 0;
		int x;
		while(num!=0)
		{
		x= num%10;					//To separate each digit...
		reverse = reverse*10 + x;	//Form a Reverse number...
		num/= 10;					//To reduce the no of digit in the initial number...	
		}
		System.out.println(reverse);
		
		
	}

	public static void main(String[] args) 
	{
	
		Reverse r = new Reverse();
		r.check();
	
	}

}
