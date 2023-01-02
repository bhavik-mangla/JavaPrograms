// Q: To check a student's grade according to his marks...
import java.util.Scanner;
 class StudGrade
{
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       int a,b,c,d,e;
       System.out.println("Enter Unit Marks (out of 100):-");
       a= in.nextInt();
       System.out.println("Enter 1st term Marks (out of 100) :-");
       b= in.nextInt();
       System.out.println("Enter 2nd Term Marks (out of 100) :-");
       c= in.nextInt();
       d= a+b+c;
       e = d/3;
       if (e >= 90) {System.out.println("Your Grade is A");}
       else if (e >= 70 && e <90 ) {System.out.println("Your Grade is B");}
       else if (e >= 50 && e <70) {System.out.println("Your Grade is C");}
       else  {System.out.println("Your Grade is D");}
            }
        }
       