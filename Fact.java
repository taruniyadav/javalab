import java.util.*;
class Fact{
public static void main(String[]mini){
Scanner sc=new Scanner(System.in);
int sum=1;
int a=sc.nextInt();
for (int i=1;i<=a;i++){
       sum=sum*i;
}
System.out.println("factorial :"+sum);
  }
}