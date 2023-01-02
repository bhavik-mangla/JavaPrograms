/*Program Statement : Write a program to input a number. Count and print the frequency of each digit present in that number. The output should be given as:
Sample Input: 44514621
Sample Output:
=====================
Digit             Frequency
=====================
1                         2
2                         1
4                         3
5                         1
6                         1
*/
package project;
import java.io.*;//importing package
class Digit_Freq//beginning of class
{
    public static void main(String args[])throws IOException
    {//beginning of main()
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");//Asking for the number
        int n = Integer.parseInt(br.readLine());
 
        int freq[]=new int[10]; //array for storing frequency of all digits
 
        for(int i=0; i<10; i++)
            {
                freq[i]=0; //intializing the count of every digit with '0'
            }
 
        /*Note: Frequency of digit '0' is stored in freq[0], frequency of '1' in freq[1] and so on*/
 
        System.out.println("Output:");
        System.out.println("===================="); //this is just for styling the look of the output
        System.out.println("Digit\tFrequency");
        System.out.println("====================");
 
        int d;
        while(n>0)
        {
            d=n%10; //extracting digit from the end
            freq[d]++; //increasing the frequency of that digit.
            n=n/10;
        }
             
        for(int i=0; i<10; i++)
            {
                if(freq[i]!=0) //printing only those digits whose count is not '0'
                    System.out.println("   "+i+"\t    "+freq[i]);
            }
        }//end of main()
    }//end of class    
/*                                  VARIABLE DESCRIPTION TABLE
 *          NAME                             DATA TYPE                            DESCRIPTION
 *          n                                  int                      For taking the value from the user.
 *          freq[]                             int                      array for storing frequency of all digits
 *          i                                  int                      counter variable for loop for intializing the count of every digit with '0'.
 *          d                                  int                      act as digit and helps increasing frequency of that digit.                   
 */
