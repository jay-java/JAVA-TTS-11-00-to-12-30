package basic;

import java.util.Scanner;

public class MultidimentionalArray {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows of array : ");
		int row = sc.nextInt();
		System.out.println("enter columns of array : ");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				System.out.print("enter value at a["+r+"]["+c+"] : ");
				a[r][c] = sc.nextInt();
			}
			System.out.println();
		}
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		int b[][] = new int[row][col];
		for(int r=0;r<b.length;r++) {
			for(int c=0;c<b.length;c++) {
				System.out.print("enter value at b["+r+"]["+c+"] : ");
				b[r][c] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int r=0;r<b.length;r++) {
			for(int c=0;c<b.length;c++) {
				System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
		
		int c[][] = new int[row][col];
		
		System.out.println(".....");
		for(int r=0;r<c.length;r++) {
			for(int c1=0;c1<c.length;c1++) {
				c[r][c1] = a[r][c1] + b[r][c1];
			}
		}
		
		System.out.println("after addition of array : ");
		for(int r=0;r<b.length;r++) {
			for(int c1=0;c1<b.length;c1++) {
				System.out.print(c[r][c1]+" ");
			}
			System.out.println();
		}
	}
}
