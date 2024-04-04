import java.util.*;
public class Switch{
public static void main(String[]args){
   int b=4;
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   System.out.println("************");
   System.out.println("*ARITHMETIC OPERATIONS*");
   System.out.println("1.ADD");
   System.out.println("2.SUB");
   System.out.println("3.MUL");
   System.out.println("4.DIV");
   System.out.println("enter your choice:");
   int ch=sc.nextInt();
   switch(ch){
       case 1->System.out.println("addition result is "+(a+b));
       case 2->System.out.println("subtraction result is "+(a-b));
       case 3->System.out.println("multiplication result is "+(a*b));
       case 4->System.out.println("division result is "+(a/b));
       default ->System.out.println("enter a proper value");
   }
 }
}