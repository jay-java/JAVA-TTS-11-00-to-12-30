package constructor;

import java.util.Scanner;

class Data1{
	int l,b,a,c;
	String name;
	long contact;
//	Data1(){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter length of rec : ");
//		l = sc.nextInt();
//		System.out.println("enter breadth of rec : ");
//		b = sc.nextInt();
//	}
//	Data1(){
//		System.out.println("hello default constrctor");
//	}
	Data1(int i){
		System.out.println("hello para constrctor");
	}
	Data1(int l,int b){
		this.l = l;
		this.b = b;
		System.out.println(l*b);
	}
	Data1(String i){
		System.out.println("hello String para constrctor");
	}
	public void area() {
		System.out.println("area of rec = "+(l*b));
	}
	Data1(Data1 d)
	{
		this.a = d.l;
		this.c = d.b;
		System.out.println("copy cons");
	}
	public void area1() {
		System.out.println("area of rec = "+(a*c));
	}
}
public class Data {
	public static void main(String[] args) {
		Data1 d = new Data1(2,3);
		d.area();
		Data1 d1 = new Data1(d);
		d1.area1();
	}
}
