//Program to decide the grades through if then else statement.
/*Avg. marks >= 90 - Grade A
 *Avg. marks >= 70 & <90 - Grade B
 *Avg. marks >= 50 & <70 - Grade C 
 *Avg. marks <50    */
package project;
import java.util.Scanner;//importing Scanner
 class GradeDECIDER 
{   //program starts here 
    public static void main (String args[])
   {   Scanner in = new Scanner(System.in);//declaring Scanner
       int a,b,c,d,e;
       System.out.println("Enter Unit Marks (out of 100):-");               
       a= in.nextInt();//asking user for unit and term marks...
       System.out.println("Enter 1st term Marks (out of 100) :-");         
       b= in.nextInt();
       System.out.println("Enter 2nd Term Marks (out of 100) :-");
       c= in.nextInt();
       d= a+b+c;        //calculatng total.
       e = d/3;  //calculating average.
       if (e >= 90) {System.out.println("Your Grade is A");}//deciding grade according to avg. marks
       else if (e >= 70 && e <90 ) {System.out.println("Your Grade is B");}
       else if (e >= 50 && e <70) {System.out.println("Your Grade is C");}
       else  {System.out.println("Your Grade is D");}
            }//main ends here
        }//program ends here
       
   
        
        
        