public class Array1 {
    public static void minimum(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void max(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 12, 13, 15, 9, 3 };
        minimum(arr);
        max(new int[] { 10, 20, 30 });
    }
}

// public static void main(String[] args) {
// int []arr = new int[]{12,21,114,150};
// for(int x:arr) //for each array ///used to print the array element one by
// one...
// {
// System.out.println(x);
// }
// }