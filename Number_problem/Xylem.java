import java.util.Scanner;

public class Xylem {
    public static void xylem(int num) {
        int first_d = num % 10;

        int last = 0, y = 0, temp = 0, sum = 0;

        while (num != 0) {
            temp = y;
            num = num / 10;
            y = num % 10;
            sum += y;
            if (num == 0) {
                last = temp;
            }
        }
        if ((last + first_d) == (sum-temp)) {
            System.out.println("Xylem Number");

        } else {
            System.out.println("Phloem Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        xylem(num);
        sc.close();
    }
}
