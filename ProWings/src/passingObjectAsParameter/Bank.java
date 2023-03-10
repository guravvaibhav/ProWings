package passingObjectAsParameter;
class Boi{
	static Bank show(Bank x) {
		
		x.nm="sita";
		x.acno=9876;
		
		return x;
	}
}

public class Bank {
String nm;
double acno;
Bank(String nm,double acno){
	this.nm=nm;
	this.acno=acno;
}
public static void main(String[] args) {
	Bank b=new Bank("sham",1234);
	System.out.println(b.nm);
	System.out.println(b.acno);
	
	System.out.println("<<<<<<>>>>>>");
	Bank z=Boi.show(b); // 1st way to pass object 
	System.out.println(z.nm);
	System.out.println(z.acno);
	
	System.out.println("<<<<<<<>>>>>");
	Bank y =Boi.show(new Bank("sham",1234));// 2nd way to pass object 
	
	System.out.println(y.nm);
	System.out.println(y.acno);
}
}
