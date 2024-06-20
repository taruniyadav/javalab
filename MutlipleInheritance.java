interface flight {
	void fly();
}
interface strength{
	void superstrength();
}
class Superhero implements flight,strength{
	String name;
public Superhero(String name){
	this.name=name;
}
@Override
public void fly()
{
	System.out.println(name +" flies through the sky!");
}
@Override
public void superstrength(){
	System.out.println(name+ " demonstrate super strength!");
}
public void useAbility(){
	System.out.println(name+ " uses super abilities!");
	}
}
public class MutlipleInheritance{
	public static void main(String []ar){
		Superhero superman= new Superhero("Superman");
		superman.useAbility();
		superman.fly();
		superman.superstrength();
	}
}