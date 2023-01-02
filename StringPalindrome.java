import java.util.Scanner;
class StringPalindrome
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
            else System.out.println("It's not a palindrome");
        }
    }

