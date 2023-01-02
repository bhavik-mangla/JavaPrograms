
import java.util.Scanner;
class cal{
      public static void main (String args[])
      { Scanner cal = new Scanner(System.in);
          double a , b;
          int z;
          System.out.println(" Enter 1st number : ");
          a=cal.nextDouble();
           System.out.println(" Enter 2nd number : ");
          b=cal.nextDouble();
           System.out.println(" Enter 1 for addition, 2 for subtraction: ");
           System.out.println(" Enter 3 for multiplication, 4 for division: ");
           System.out.println(" Enter 5 for remainder, 61 for square root of 1st number: ");
           System.out.println(" Enter 62 for square root 2nd number and 7 for exit: ");    
           z=cal.nextInt();
           if (z==1){System.out.println(" Result = " + (a+b));}
           if (z==2){System.out.println(" Result = "+ (a-b));}
           if (z==3){System.out.println(" Result = " + (a*b));}
           if (z==4){System.out.println(" Result = " + (a/b));}
           if (z==5){System.out.println(" Result = " + (a%b));}
           if (z==61){System.out.println(" Result = " + Math.sqrt(a));}
           if (z==62){System.out.println(" Result = " + Math.sqrt(b));}
 
        }
}
    