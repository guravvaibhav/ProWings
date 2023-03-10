package passingObjectAsParameter;
class Display{
	void display(Address x) {
		System.out.println(x.streetnm);
		System.out.println(x.landmark);
		System.out.println(x.town);
		System.out.println(x.pincode);
	}
}
public class Address {
	String streetnm,landmark,town;
	int pincode;
	Address(String streetnm,String landmark,String town,int  pincode){
		this.streetnm=streetnm;
		this.landmark=landmark;
		this.town=town;
		this.pincode=pincode;
	}
	public static void main(String[] args) {
		Address a1=new Address("MG road", "near city mall", "Kolhapur",416202);
		Display d=new Display();
		d.display(a1);
	}
	
	
}
