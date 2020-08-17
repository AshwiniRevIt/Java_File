import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		if((n%2)==0)
		{
			System.out.println(n+" is a even Number");
		}
		
		else {
			System.out.println(n+" is a Odd");
		}

	}

}
