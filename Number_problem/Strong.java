import java.util.Scanner;

public class Strong {
    public static void strong(int num) {
        int temp = num, sum = 0, x  ;

        while (num > 0) {
            x = num % 10;
          int  fact = 1;
            num = num / 10;

            // To find the Factorial of the Number...
            while (x > 0) {
                fact*=x;
                x--;
            }
            // Sum of the Factorial
            sum = sum + fact;
        }
        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        strong(num);
        sc.close();
    }
}
