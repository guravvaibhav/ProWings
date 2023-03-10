
public class StaticInstanceDiff {
	static int x=10;
	int y=20;
public static void main(String[] args) {
	StaticInstanceDiff s1=new StaticInstanceDiff();
	s1.x=888;
	s1.y=999;
	StaticInstanceDiff s2=new StaticInstanceDiff();
	System.out.println(s2.x+" "+s2.y);
}
}
