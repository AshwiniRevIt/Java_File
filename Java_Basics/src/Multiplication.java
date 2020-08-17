
public class Multiplication {
	
	void mul() {
		int a=3,b=2;
		int c=a*b;
		System.out.println(c);
	}
	void mul(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	void mul(int a,int b,int c) {
		int d=a*b*c;
		System.out.println(d);
	}
		
	double mul(int a, double b) {
		double c=a*b;
		return c;
	}

	public static void main(String[] args) {
	Multiplication m = new Multiplication();
	m.mul();
	m.mul(10, 5, 2);
	System.out.println(m.mul(5, 3.2));
	}

	

}
