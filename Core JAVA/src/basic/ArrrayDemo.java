package basic;

import java.util.Scanner;

public class ArrrayDemo {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int index =0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.print("enter value at a["+i+"] : ");
			a[i]  = sc.nextInt();
		}
		int num=0;
		for(int i=0;i<a.length;i++) {
			num = num+a[i];
		}
		System.out.println("addition of elements in array : "+num);
		System.out.println("enter value to search in arrya : ");
		int n = sc.nextInt();
		int counter=0;
		for(int i=0;i<a.length;i++) {
			if(n == a[i]) {
				counter++;
			}
		}
		System.out.println(n+" is reapeated "+counter+" times");
//		if(counter==1) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
	}
}
