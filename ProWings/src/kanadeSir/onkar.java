package kanadeSir;

import java.util.Arrays;

public class onkar {
public static void main(String[] args) {
	int a[]= {5,3,7,8,3};
	int num=0;
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>a[i+1]) {
		num=a[i];
		a[i]=a[i+1];
		a[i+1]=num;
		
	}
	
	}
	System.out.println(Arrays.toString(a));
}
}
