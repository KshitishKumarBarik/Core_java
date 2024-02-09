package Number_problem;
import java.util.Scanner;
public class Armstrong {
	public static void m1(int num)
	{
		int x =0;
		int sum = 0;
		int y;
		int num1 = num;	 	//Storing the initial number value inside another variable for Comparing purpose...
		while(num!=0)
		{
			x= num%10;		//to separate the digit ...
			num= num/10;	//to separate last digit from the  initial number
			y = (x*x*x);
			sum = sum + y;  // Sum of the cube of each digit...
		}
		if (sum ==num1)
		{
			System.out.println("This is an Armstrong Number");
		}
		else
		{
			System.out.println("This is not an Armstrong Number");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		m1(num);
		sc.close();
		

	}

}
