import java.util.Scanner;
class replace
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
           String s=in.nextLine();
           s=s +" ";
           s=s.replace("January 26","August 15");
           s=s.replace("a Republic","an Independence");
           System.out.println(s);
        }
        }
    