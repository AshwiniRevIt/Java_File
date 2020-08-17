
public class Arthmetic extends Calculation {

	@Override
	public int add() {
		int d=10,e=20;
		int f=d+e;
		System.out.println(f);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		super.mul();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthmetic a = new Arthmetic();
		a.add();

	}

}
