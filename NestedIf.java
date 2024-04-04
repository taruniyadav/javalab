import java.util.*;
public class NestedIf{
  public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your favourite iconic character:");
        String act=sc.nextLine();
        if(act.equals("Iron Man")){
           System.out.println("great choice");
           System.out.println("enter " +act+ " real name");
           String real=sc.nextLine();
           if(real.equalsIgnoreCase("tony stark")){
                System.out.println("cool!!");
           }
   }
    else{
      System.out.println(act);
     }
   System.out.println("end!!");
  } 
}