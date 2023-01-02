import java.util.Scanner;
class FinalMarks
{
   public static void main (String []args)
    { Scanner in = new Scanner (System.in);
        double a,b,c,d,e,f,g,h;
        System.out.println("Enter 1st Term Marks");
        a = in.nextDouble();
        System.out.println("Enter 2nd Term Marks");
        b = in.nextDouble();
        System.out.println("Enter 3rd Term Marks");
        c = in.nextDouble();
        d = 0.30*a;
        e = 0.30*b;
        f = 0.40*c;
        g = d + e + f;
        h = g/5;
        System.out.println("Weighted Marks = " + g + " out of 500");
        System.out.println("Weighted Percentage = " + h + "%");
    }
}
 