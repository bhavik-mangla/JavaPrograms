import java.util.Scanner;
 class hseb
{
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       double a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
       System.out.println("Enter the units consumed :-");
       a= in.nextDouble();
       b= 75.0;
       c= (4.0/100);
       d= 180.0;
       e= (12.5/100)*d;
       f= (2.0/100)*e;
       g= d+e+f;
       h= g-(c*g);
       i= (0.75*a)+d+e+f;
       j= i-(c*i);
       k= (1.25*a)+d+e+f;
       l= k-(c*k);
       m= (2.50*a)+d+e+f+b;
       n= m-(c*m);
       o= (5.00*a)+d+e+f+b;
       p= o-(c*o);
       if (a <=50) {System.out.println("Electricity bill = "+h);}
       else  if (a >=51  &&  a<=100) {System.out.println("Electricity bill = "+j);}
       else  if (a >=101 &&  a<=250) {System.out.println("Electricity bill = "+l);}
       else  if (a >=251 &&  a<=500) {System.out.println("Electricity bill = "+n);}
       else  if (a > 500) {System.out.println("Electricity bill = "+p);}
       else {System.out.println("Values are not accepted between 50&51,100&101,250&251...., so write their round-off value please..... ");}
           
            }
        }
       