import java.util.Scanner; 
class moviemagic
{
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       double rate;
       System.out.println("Enter the ratings for movie magic :-");
       rate= in.nextDouble();
       if (rate <=2.0) System.out.println("Flop");
       else if (rate >=2.1 && rate<=3.4 ) System.out.println("Semi Hit");
       else if (rate>=3.5 && rate<=4.5) System.out.println("Hit");
        else if (rate >=4.6 && rate<=5.0 ) System.out.println("Super Hit");
        else  System.out.println("You can only rate between 0 and 5 ...");
            }
        }
         
        /*                            
         *                             "VDT TABLE"
         *       Variable Name             Data Type                Purpose
         *         rate                     double           To input ratings from the user.       
         */