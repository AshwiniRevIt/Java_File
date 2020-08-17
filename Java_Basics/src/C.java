
public class C extends B{
	
	

	@Override
	public void A() {
		System.out.println("C's method");
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A ref;
		ref = a;
		ref.A();
		ref = b;
		ref.A();
		ref = c;
		ref.A();
		

	}

}
