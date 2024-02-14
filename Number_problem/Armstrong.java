import java.util.Scanner;

public class Armstrong {
    public static void armstrong(int num) {
        int count = 0, power = 1;
        int num1 = num;
        int sum = 0;
        int x;
        
        while (num != 0) 
        {
            x = num % 10; 
            num = num / 10; 
            count++; // 1 //2

            for (int i = 1; i <= count; i++) 
            {
                power *= x; 
            }
            sum += power;   
        }
        if (sum == num1) {
            System.out.println("Armstrong Number");

        } else {
            System.out.println("Not an Armstrong Number");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        armstrong(num);

    }
}
