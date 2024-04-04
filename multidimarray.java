import java.util.*;
              class multidimarray{
                  public static void main(String[] ar){
                   int marks[][]= new int[5][2];
                   Scanner sc=new Scanner(System.in);
                   System.out.println("enter the following:");
                   for(int i=0;i<marks.length;i++){
                      System.out.println("rollno:");
                      marks[i][0]=sc.nextInt();
                      System.out.println("marks:");
                      marks[i][1]=sc.nextInt();
                   }
              for(int j=0;j<marks.length;j++){
                System.out.println("rollno:  "+marks[j][0]+"marks: "+marks[j][1]);
                 }
       }
 }