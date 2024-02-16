import java.util.Scanner;

public class Asc_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = s.nextInt();
        int[] x = new int[size];
        System.out.println("Enter Array Element");
        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        s.close();
    }
}
