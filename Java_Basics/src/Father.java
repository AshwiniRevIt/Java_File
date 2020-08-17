
public class Father {
	public void swim() {
		System.out.println("Father knows to swim");
	}
	
	private void drive() {
		System.out.println("Father only knows to Drive");
		
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.swim();
		Father f = new Father();
		f.drive();
		f.swim();

	}


}
