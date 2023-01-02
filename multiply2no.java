/*program multiply2no */
import java.util.Scanner;
class multiply2no
 
     { public static void main (String args[])
    {System.out.println("Enter two number to multiply them");
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
      System.out.println("Result of entered two number = "+z);  
    }
} 
