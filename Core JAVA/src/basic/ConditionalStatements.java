package basic;

import java.util.Scanner;

//1.simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a = ");
		int a = sc.nextInt();
		System.out.println("enter value of b = ");
		int b = sc.nextInt();
		// 1.simple if
		if (a > b) {
			System.out.println("yes a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		
		//3.nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("yes eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}
		
		//4.else if ladder
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=50) {
			System.out.println("pass class");
		}
		else if(marks>=51 && marks<=70) {
			System.out.println("C class");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("B class");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("A class");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("A+ class");
		}
		else {
			System.out.println("invalid input");
		}
		
		
		//5.switch
		System.out.println("enter your choice : ");
		int c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("English");
			break;
		case 2:
			System.out.println("Hindi");
			break;
		case 3:
			System.out.println("gujarati");
			break;
			default:
				System.out.println("invalid input");
		}
	}
}
