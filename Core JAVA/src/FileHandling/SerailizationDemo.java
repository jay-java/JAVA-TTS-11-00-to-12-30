package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	double per;
	Student(int id,String name,double per){
		this.id = id;
		this.name= name;
		this.per=per;
	}
	@Override
	public String toString() {
		return "id : "+id+ " name : "+name+" per : "+per;
	}
}
public class SerailizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Student s1 = new Student(1, "java", 60.6);
//		FileOutputStream fos = new FileOutputStream("student.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		oos.flush();
//		System.out.println("object written successfully");
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		System.out.println(s);
	}
}
