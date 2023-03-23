package OOPS;
class Data{
	private int id;
	private String name;
	private double salary;
	public void setId(int id) {
		this.id =id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalaty(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}
public class ENcapsulationDmeo {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.setId(1);
//		System.out.println(d1.getId());
		d1.setName("java");
//		System.out.println(d1.getName());
		d1.setSalaty(3434.343);
//		System.out.println(d1.getSalary());
		System.out.println(d1);
	}
}
