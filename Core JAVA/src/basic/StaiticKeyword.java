package basic;
class Data{
	static {
		System.out.println("static block in data class");
	}
	int rollno;
	double per;
	String name;
	static String cname = "TOPS";
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	Data(int rollno,double per,String name){
		this.rollno = rollno;
		this.per = per;
		this.name= name;
	}
	public void showData() {
		System.out.println("Rollno : "+rollno+" Per : "+per+" Name : "+name+" Cname : "+cname);
	}
	public static void callStatic() {
		System.out.println("static method called");
	}
}
public class StaiticKeyword {
	static {
		System.out.println("static block inside main class");
	}
	public static void main(String[] args) {
		Data d1 = new Data(1, 34.3, "a");
		d1.showData();
		Data d2 = new Data(2, 35.3, "b");
		d2.showData();
		Data d3 = new Data(3, 37.3, "c");
		d3.showData();
		Data d4 = new Data(4, 33.8, "d");
		d4.showData();
		Data.callStatic();
	}
}
