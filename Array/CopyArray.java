import java.util.Scanner;
public class CopyArray 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size  = sc.nextInt();
        System.out.println("Enter the Array Elements...");
        int[]  x = new int [size];
        int []y = new int [size];
        for(int i =0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<y.length;j++)
            {
                if(i==j)
                {
                    y[i]=x[i];
                }
            }
        }
        System.out.println(x[3]==y[3]);
        System.out.println(y[3]);
         
        sc.close();
    }
    
}
