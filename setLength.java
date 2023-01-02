import java.util.Scanner;
class setLength
 {
     public static void main(String args[])
      {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the word");
          String s=in.nextLine();
          StringBuffer sb = new StringBuffer(s);
          sb.setLength(3);
          System.out.println(sb);
          System.out.println(sb.capacity());
        }
    }

