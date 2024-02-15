import java.util.Scanner;

public class Buzz {
    // boolean b = true;
    public static boolean buzz(int x)
    {
 
        if(x%7==0 || x%10==7)
        {
            return true;
        }
        else
        {
            return false;
        }
         
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        buzz(num);
        sc.close();
    }
}
