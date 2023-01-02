import java.util.Scanner;
class Q6_2016
 {
     public static void main(String args[])
      {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the word");
          String s=in.nextLine();
          StringBuffer sb = new StringBuffer(s);
          sb=sb.reverse();
          String s1=sb.toString();
          if(s.equals(s1))
          {System.out.println("It's a palindrome");
            }
            else if(s.charAt(0)==s.charAt(s.length()-1)) {
                System.out.println("It's only a special word");
            }
            else
             System.out.println("It's neither a special word nor a palindrome");
        }
    }


