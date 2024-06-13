class SuperHero{
String name;
String power;
public SuperHero(String name, String power){
this.name = name;
this.power = power;
}
public void usePower(){
System.out.println(name + " uses " +power);
}
}
class IronMan extends SuperHero{
public IronMan(String name){
super (name, " advanced technology");
}
}
class Spiderman extends SuperHero{
public Spiderman(String name){
super (name, " web-slinging and spider-like abilities");
}
}
class SuperMan extends SuperHero{
public SuperMan(String name){
super (name, "powers to save lifes");
}
}
class Hulk extends SuperHero{
public Hulk(String name){
super (name, " his powers to lift rocks");
}
}
public class hierarchial{
public static void main(String []a){
IronMan ironman = new IronMan("Iron man");
Spiderman spiderman = new Spiderman("Spider man");
SuperMan superman = new SuperMan("Super Man");
Hulk hulk = new Hulk("HULK");
ironman.usePower();
spiderman.usePower();
superman.usePower();
hulk.usePower();
}
}
