package basic;

public class StringDemo {
	public static void main(String[] args) {
//		char c[] = {'j','a','v','a',' ','h','e','l','l','o','\0'};
//		System.out.println(c);
		String s= "java";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		String s1= "JaVA";
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s.contains("v"));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		String s2 = "		ja   va			";
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		System.out.println(s2.replace('a', 'b'));
		System.out.println(s2);
		System.out.println(s2.trim());
	}
}
