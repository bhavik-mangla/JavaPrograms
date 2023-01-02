//Program to print the days name through switch case.
package project;
import java.util.Scanner;//importing Scanner
class daysBYdayNum 
{ //program starts here 
   public static void main(String[] args) 
   {
      Scanner in = new Scanner (System.in);//declaring Scanner
      System.out.println("Enter the day number");
      int dayNumber = in.nextInt();//asking user for day number.
      String day;   
      switch (dayNumber) //switching dayNumber variable
      {//Monday to Sunday
         case 1: day = "Monday";
         break;
         case 2: day = "Tuesday";
         break;
         case 3: day = "Wednesday";
         break;
         case 4: day = "Thursday";
         break;
         case 5: day = "Friday";
         break;
         case 6: day = "Saturday";
         break;
         case 7: day = "Sunday";
         break;
         default:day = "Invalid day";
         break;
        }
      System.out.println(day);//printing name of the day...
   }        //main ends here
      }  //program ends here
