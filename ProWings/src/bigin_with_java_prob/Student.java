package bigin_with_java_prob;





public class Student {

	static String school="abc school";
	int roll;
	String name,address;
	
	public Student(int roll,String name,String address)
	{
		System.out.println("constructor");
		this.roll=roll;
		this.name=name;
		this.address=address;
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(10,"ram","pune");
		Student s2=new Student(20,"sham","mumbai");
		Student s3=new Student(30,"rajaram","kolhapur");
		
		System.out.println("\nfor student 1");
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(school);
		
		System.out.println("\nfor student 2");

		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(school);
		
		System.out.println("\nfor student 3");
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		System.out.println(s3.address);
		System.out.println(school);
	}

}
