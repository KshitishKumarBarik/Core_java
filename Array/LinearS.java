import java.util.Scanner;

public class LinearS {
    static void linearS(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of an Array");
        int size = sc.nextInt();
        int[] x = new int[size];
        System.out.println("Enter Array elements");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the Array...");
        int element = sc.nextInt();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == element) {
                System.out.println(i);
            }

        }
        sc.close();
    }

    public static void main(String[] args) {

        linearS(5);

    }
}
