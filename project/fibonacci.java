/*Program Statement :Print the Fibonacci series between two limits. */
//BEGINNING OF THE PROGRAM
package project;
import java.util.*;//importing package java.util.*
public class fibonacci//beginning of class
{
    public static void main(String args[])
    {//beginning of main()
        Scanner yup=new Scanner(System.in);
        System.out.println("ENTER THE LIMITS FOR THE FIBONACI SERIES.....");
        System.out.print("ENTER THE LOWER LIMIT: ");
        int lower=yup.nextInt();                                          //TAKING TH LOWER LIMIT
        System.out.print("ENTER THE UPPER LIMIT: ");
        int upper=yup.nextInt();                                          //TAKING TH UPPER LIMIT
        int n=1,o=0;    
        for(int i=1;i<=upper;i++)   {   
            if(o>=lower && o<=upper)    //GIVING THE CONDITION OF THE RANGE OF VALUES SO THAT IT STAYS WITHIN THE LIMIT. 
            {
                System.out.println(o);  
            }                       
            n=n+o;
            o=n-o;           
        }//end of for
    }//end of main()
}//end of class 
//program ends
/*                   VARIABLE DESCRIPTION TABLE
 *    
 *    NAME                  DATA TYPE                             DESCRIPTION
 *    lower                    int                   FOR STORING THE MINIMUM VALUE THAT CAN BE PRINTED.                      
 *    upper                    int                   FOR STORING THE MAXIMUM VALUE THAT CAN BE PRINTED.                       
 *    n                        int                   FOR INCREASING THE VALUE OF o TO PRINT PERFECT FIBONACCI SERIES.
 *    o                        int                   FOR INCREASING ITS OWN VALUE BY SUBTRACTING FROM INCREASED VALUE.
 *    i                        int                   IT IS USED IN DEFINING LOOP. 
 */
