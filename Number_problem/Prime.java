
import java.util.Scanner;
public class Prime 
{
	public static void prime(int num)
	{
        if(num>2 && num%2==0)
        {
            System.out.println(" Not a Prime Number");
        }
        else
        {

            int count= 0;   		//used to keep count of the completely divisible number....
            for(int i =1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                    
                }
                
            }
		 if(count==2)
		 {
			 System.out.println("This is a Prime Number");
		 }
		 else
		 {
             System.out.println("This is not a Prime Number");
            }
        }
        
    }
        
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		prime(num);
		sc.close();
		

	}

}
