///program begins from here 
import java.util.Scanner;
class employee
{ public static void main (String args[])
    { Scanner in = new Scanner(System.in);
        String x;
        System.out.println("Enter your name :-");
         x= in.nextLine();
         double  y;
         double a, b, c;
        System.out.println("Enter your salary :-");
        y= in.nextDouble();
        a = 25.0/100 *y;
        b = 15.0/100 *y;
        c = (8.3/100) *y;
        System.out.println("Name : " + x);
        System.out.println("Basic Salary : " + y);
        System.out.println("Net Salary : " + (a+b+y));
        System.out.println("Gross Salary : " + ((a + b + y) - c));
    }
}