package arrays;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Array size");
		 int size=sc.nextInt();
	 
		 int a[] = new int[size];
		 for(int i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
		 }
		 for(int i= 0;i<a.length;i++){
				 if(i%2==0  ){
					 System.out.print(a[i]  +" ");
				 }
			 }
		 }
		 

	}


