class shape{
	public int x,y,s;
	void printArea(){
		System.out.println("prints the area of a shape");
	}
}
class Rectangle extends shape{
	void printArea(){
		System.out.println("area of rectangle is: "+x*y);
		}
	}
class Square extends shape{
	void printArea(){
		System.out.println("area of the square is: "+s*s);
	}
}
public class overridden{
	public static void main(String[] ar){
		Rectangle r = new Rectangle();
		r.x=10;
		r.y=20;
		r.printArea();
		shape t=new shape();
		t.printArea();
		Square s = new Square();
		s.s=10;
		s.printArea();
	}
}