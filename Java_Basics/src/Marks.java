import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the marks");
		int m1 = S.nextInt();
		int m2 = S.nextInt();
		int m3 = S.nextInt();
		int m4 = S.nextInt();
		
		if(m1<35||m2<35||m3<35||m4<35)
		{
			System.out.println("RESULT : Fail");
		
		}
		
		else {
			double per =(m1+m2+m3+m4)/4.0;
			if (per >= 85)
			{
				System.out.println("RESULT : Distinction");
			}
			
			else if (per >= 60){
				System.out.println("RESULT : First Class");
			}
			
			else if (per >= 50) {
				System.out.println("RESULT : Second Class");
			}
			
			else {
				System.out.println("RESULT : Fail");
			}
		}

	}

}
