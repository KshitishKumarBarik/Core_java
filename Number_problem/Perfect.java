import java.util.Scanner;
public class Perfect
{
    public static void perfect(int num)
    {
        int divisor=0,sum=0;
        for(int i= 1;i<num;i++)
        {
            if(num%i==0)
            {
                divisor = i;
                sum += divisor;  //sum =sum+divisor
            }
        }
        if(sum == num)
        {
            System.out.println("perfect Number...");

        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
    public static void main(String [] args)
    {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = p.nextInt();
        perfect(num);
        p.close();
    }
}