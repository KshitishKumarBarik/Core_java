import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        neon(num);
    }

    public static void neon(int num) {
        int x, sum = 0;
        int num1 = num;
        while (num > 0) {
            x = num % 10;
            num /= 10;
            sum += x;
        }
        if ((sum * sum) == num1) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");

        }

    }
}
