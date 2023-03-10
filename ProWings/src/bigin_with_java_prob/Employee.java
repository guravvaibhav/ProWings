package bigin_with_java_prob;

public class Employee {

	int id,payment;
	String name;
	
	public Employee(String name,int id,int payment)
	{
		this.name=name;
		this.id=id;
		this.payment=payment;	
	}
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("ram",123,1000);
		Employee e2=new Employee("rajaram",124,2000);
		Employee e3=new Employee("ramanujan",125,3000);	
		
		System.out.println("\nemployee 1");
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.payment);
		
		System.out.println("\nemployee 2");
		
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.payment);
		
		System.out.println("\nemployee 3");
	
		System.out.println(e3.name);
		System.out.println(e3.id);
		System.out.println(e3.payment);
		
	}

}
