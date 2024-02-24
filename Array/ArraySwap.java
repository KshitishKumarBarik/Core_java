package arrays;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Array Size");
		 int size=sc.nextInt();
		 int[] arr =new int[size];
		 System.out.println("Enter Array Elements");
		 for(int i = 0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 for(int i = 0;i<arr.length-1;i+=2){
			 int temp= arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		 System.out.println("The Array element after Swapping (Alternative Indexes) are :");
		 for(int i =0 ;i<arr.length;i++){
			 System.out.print(arr[i] +" ");
		 }
	}

}
