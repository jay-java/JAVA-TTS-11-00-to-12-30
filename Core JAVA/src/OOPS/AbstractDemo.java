package OOPS;
abstract class RBI{
	abstract public void interest();
	abstract public void homeloan();
	public static void RepoRate() {
		System.out.println("+-4%");
	}
	public void guidelines() {
		System.out.println("for all");
	}
}
class SBI extends RBI{
	public void interest() {
		System.out.println("sbi interest : 6%");
	}
	public void homeloan() {
		System.out.println("sbi homeloan : 8%");
	}
	
}
class JAVA extends RBI{
	public void interest() {
		System.out.println("java interest : 8%");
	}
	public void homeloan() {
		System.out.println("java homeloan : 9%");
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.homeloan();
		SBI.RepoRate();
		s.RepoRate();
		s.guidelines();
		JAVA j = new JAVA();
		j.interest();
		j.homeloan();
		JAVA.RepoRate();
		j.guidelines();
	}
}
