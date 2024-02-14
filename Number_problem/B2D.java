import java.util.Scanner;
// Printing the ASCII value of the user input character...

public class B2D
{
    public static void convert(char ch)
    {
        int result = (int)ch;
        System.out.println(result);

    }
 public static void main(String[] args) {
    System.out.println("enter any character");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    convert( ch);

 }   
}
