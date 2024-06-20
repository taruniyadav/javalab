public class overloading{
	public void calculate(){
		System.out.println("nothing to calculate");
	}
	public void calculate(int x){
		System.out.println("circle area:"+Math.PI*Math.pow(x,2));
	}
	public void calculate(double x){
		System.out.println("circle perimeter:"+2*Math.PI*x);
	}
	public void calculate(int x,int y){
		System.out.println("rectangle area:"+x*y);
	}
	public void calculate(int x, int y, int z){
		System.out.println("rectangle perimeter :"+x*y*z);
	}
	public static void main(String[] ar){
		overloading area= new overloading();
		area.calculate();
		area.calculate(2,3,4);
		area.calculate(10,20);
		area.calculate(10.5);
		area.calculate(10);
	
	}
}