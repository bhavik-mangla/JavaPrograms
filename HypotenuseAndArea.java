import java.util.Scanner;
class HypotenuseAndArea
{
   public static void main (String args[])
      { System.out.println("Enter the 2 sides (in cm) other than hypotenuse to check their hypotenuse and area.");
        double x, y, z, a;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = Math.sqrt((x*x)+(y*y));
        a = 0.5 * x * y;
        System.out.println("Hypotenuse = " + z +(" cm"));
        System.out.println("Area = " + a + (" cm²"));
    }
}
         