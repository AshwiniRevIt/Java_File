
public class Rectangle extends Shape{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.area();
		Circle c = new Circle();
		c.area();

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l=2,b=5;
		int area = l*b;
		System.out.println(area);
		
	}

}
