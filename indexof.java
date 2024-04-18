public class indexof{
          public static void main(String[] ar){
              String str="tonight we are leaving ton";
              System.out.println(str.indexOf('u'));
              System.out.println(str.indexOf('g'));
              System.out.println(str.indexOf('e',10));
              String s2="ton";
              System.out.println(str.indexOf(s2));
              System.out.println(str.indexOf(s2,5));
    } 
}