package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Info{
	int rollno;
	String name;
	double per;
	public Info(int rollno, String name, double per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Info [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
}
public class StudentData {
	public static void main(String[] args) {
		Info i1 = new Info(1,"vivek",67.6);
		Info i2 = new Info(2,"umesh",33.6);
		Info i3 = new Info(3,"amit",68.6);
		Info i4 = new Info(4,"vihar",57.6);
		Info i5 = new Info(5,"dhruvin",77.6);
		List<Info> list = new ArrayList<Info>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
