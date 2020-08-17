import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		if(n>0)
		{
			System.out.println(n+ " is Positive");
			System.out.println(n+"+ve");
		}
		
		if(n<0)
		{
			System.out.println(n+ " is negative");
			System.out.println(n+"-ve");
		}
		
		if(n==0)
		{
			System.out.println(n+ " is Zero");
		}
		

	}

}
