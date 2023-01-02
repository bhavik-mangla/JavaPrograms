import java.util.Scanner;
class numswitching1
{
   public static void main (String args[])
      { System.out.println("Enter 1st number(x) and 2nd number(y) to switch them.");
        double x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("x = ");///10
        x = in.nextInt();
        System.out.println("y = ");///20
        y = in.nextInt();
        z = x;///10=z
        x = y;///20=x
        y = z;///y=z=10
        System.out.println("x = " + x );
        System.out.println("y = " + y );
    }
}