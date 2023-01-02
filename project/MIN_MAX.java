/*Program Statement : Printing the maximum and minimum number of an array. */
//BEGINNING OF THE PROGRAM
package project;
import java.util.*;//importing package java.util
public class  MIN_MAX
{//beginning of class
    public static void main(String[] args) 
    {//beginning of main()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");//ASKING THE SIZE OF ARRAY
        int s = sc.nextInt();
        int numbers[] = new int[s];  
            for(int i=0;i<numbers.length;i++)   {
                System.out.print("Enter a number :-");
                numbers[i]=sc.nextInt();                       //TAKES THE VALUE FROM THE USER. 
            }
        int smallest = numbers[0];                                                  
        int largetst = numbers[0];                                                
        for(int i=1; i< numbers.length; i++)            //CALCULATING THE SMALLEST AND THE LARGEST                 
        {                                                                        
            if(numbers[i] > largetst)                          // PROVIDING THE CONDITION.
                largetst = numbers[i];
            else if (numbers[i] < smallest)                    
                smallest = numbers[i];
        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }//end of main()
}//end of class
//program ends here
/*                             VARIABLE DESCRIPTION TABLE
 *                  NAME              DATA TYPE                   DESCRIPTION
 *                  s                     int              TAKES THE SIZE OF THE ARRAY FROM USER.
 *                  number[]              int              FOR STORING THE VALUE.                 
 *                  smallest              int              FOR STORING THE SMALLEST VALUE.                  
 *                  largest               int              FOR STORING THE LARGEST VALUE.                
 *                  i                     int              IT IS USED IN DEFINING LOOP.                    
 */
