import java.util.Scanner;

public class OPerations {

	public static void main(String[] args) {
		Scanner arth = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int a = arth.nextInt();
		
		System.out.println("Enter the value of B : ");
		int b = arth.nextInt();
		
		int c = a+b;
		int d = a*b;
		int e = a-b;
		int f = a/b;
		
		System.out.println("Addition "+c);
		System.out.println("Multiplication "+d);
		System.out.println("Subtraction "+e);
		System.out.println("Division "+f);
		

	}

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

	

}
