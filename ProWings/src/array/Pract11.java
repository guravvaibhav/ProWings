package array;

public class Pract11 {
public static void main(String[] args) {
	int a[]= {21,-34,5,-54,-23};
	int ap[]=new int[5];
	int an[]=new int[5];
	int p=0,n=0,i;
	for(i=0;i<=4;i++) {
		if(a[i]<0) {
			an[n]=a[i];
			n++;
		}
		else {
			ap[p]=a[i];
			p++;
		}
			
	}
	System.out.println("positive values are");
	for(i=0;i<ap.length;i++)
		System.out.println(ap[i]);
	System.out.println("negative values are");
	for(i=0;i<ap.length;i++)
		System.out.println(an[i]);
	
	
	
}
}