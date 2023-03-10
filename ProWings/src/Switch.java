import java.util.Scanner;
public class Switch {
static int i;
static int j;
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String modelNm;
		System.out.println("ENTER MODEL NAME");
		modelNm=sc.next();
		
		switch(modelNm)
		{
		case "HF_DELUX":
			System.out.println("COMPANY NAME IS :- HIRO MOTORS");
			System.out.println("MIELAGE IS :- 60 TO 70 KM/L");
			System.out.println("MAX SPEED IS :- 85 TO 90 KM/HR");
			break;
		case "PULSER_220":
			System.out.println("COMPANY NAME IS :- Bajaj Auto");
			System.out.println("MIELAGE IS :- 38 KM/L");
			System.out.println("MAX SPEED IS :- 134 KM/HR");
			break;
		case "DUKE_390":
			System.out.println("COMPANY NAME IS :- Bajaj Auto & KTM ASIA");
			System.out.println("MIELAGE IS :- 25.7 KM/L");
			System.out.println("MAX SPEED IS :- 167 KM/HR");
			break;
		default:
			System.out.println("MODEL NOT FOUND");
		}
		
		
	int w=	(i<j)?(23):(43);    // turnery operator
	System.out.println(w);
	}

}
