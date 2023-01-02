import java.util.Scanner;
class thirdsideAreaTRIANGLE
{
   public static void main (String args[])
      { System.out.println("Enter the 2 sides (in cm) :- First hypotenuse and then any other side,  to check the third side and area.");
        double x, y, z, a;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = Math.sqrt((x*x)-(y*y));
        a = 0.5 * y * z;
        System.out.println("Third side = " + z +(" cm"));
        System.out.println("Area = " + a + (" cm²"));
    }
}