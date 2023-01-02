import java.util.Scanner;
 class SaleREven
{
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       double a,b,d,e,f;
       System.out.println("Enter  price of a product brought :-");
       a= in.nextInt();
       System.out.println("Enter Units of products brought :-");
       b= in.nextInt();
       d= a*b;
       e=d-(10.0/100*d);
       f=d-(15.0/100*d);
       if (d >120) {System.out.println("Discount rate = 15%  ,  Amount to pay = "+f);}
       else if (d < 100 ) {System.out.println("Discount rate = 0% (No discount)  ,  Amount to pay = "+d);}
       else if (d>=100 && d<=120) {System.out.println("Discount rate = 10%   ,   Amount to pay = "+e);}
           
            }
        }
       