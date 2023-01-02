import java.util.Scanner;
class numswitching2
{
   public static void main (String args[])
      { System.out.println("Enter 1st number(x) and 2nd number(y) to switch them.");
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("x = ");//18
        x = in.nextInt();
        System.out.println("y = ");//30
        y = in.nextInt();
        x = x+y;//18+30=48=x
        y = x-y;//y=48-y=48-30=18
        x = x-y;//y=18;x=48;x=48-18=30
        System.out.println("x = " + x );
        System.out.println("y = " + y );
    }
}