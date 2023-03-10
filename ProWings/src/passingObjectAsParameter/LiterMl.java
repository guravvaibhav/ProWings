package passingObjectAsParameter;

class Addlit {
	int lsum = 0;

	LiterMl add(LiterMl x, LiterMl y) {
		int mlsum = x.ml + y.ml;
		if (mlsum >= 1000) {
			lsum = 1;
			mlsum = mlsum / 10;
		}
		lsum = lsum + x.l + y.l;
		LiterMl z = new LiterMl(lsum, mlsum);
		return z;
	}
}

public class LiterMl {
	int l;
	int ml;

	LiterMl(int l, int ml) {
		this.l = l;
		this.ml = ml;
	}

	public static void main(String[] args) {
		LiterMl l1 = new LiterMl(12, 600);
		LiterMl l2 = new LiterMl(9, 800);
		Addlit a1 = new Addlit();
		LiterMl b = a1.add(l1, l2);
		System.out.println(b.l+" Liter");
		System.out.println(b.ml+" ml");

	}
}
