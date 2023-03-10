package passingObjectAsParameter;

class Add {
	static Distance add(Distance x, Distance y) {
		int kmsum = 0;
		int msum = x.m + y.m;
		if (msum >= 1000) {
			kmsum = 1;
			msum = msum - 1000;
		}
		kmsum = kmsum + x.km + y.km;
		Distance z = new Distance(kmsum, msum);
		return z;
	}
}

public class Distance {
	int km;
	int m;

	Distance(int a, int b) {
		this.km = a;
		this.m = b;
	}

	public static void main(String[] args) {
		Distance d1 = new Distance(5, 700);
		Distance d2 = new Distance(4, 600);
		Distance tot = Add.add(d1, d2);
		System.out.println(tot.km+" km");
		System.out.println(tot.m+" m");
	}
}
