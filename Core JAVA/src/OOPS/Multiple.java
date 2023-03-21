package OOPS;
class Parent1{
	public void run() {
		System.out.println("run inside parent 1 class");
	}
}
class Parent2{
	public void run() {
		System.out.println("run inside parent 2 class");
	}
}
class ChildClass extends Paren1,Parent2{
	
}
public class Multiple {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.run();
	}
}
