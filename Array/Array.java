import java.util.Scanner;
public class Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int []x =  new int [size];
        System.out.println("Enter the elements of an Array");

        for(int i =0;i<x.length;i++)
        {
            x[i] = sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i] +" ");
        }
        sc.close();
    }
    
}
