/*Program Statement : Write a program to assign a full path and file name as given below.
Using library functions, extract and output the file path, file name and file extension separately as shown.
Input: C:Users\admin\Pictures\flowers.jpg
Output:
Path: C:Users\admin\Pictures
File name: flower
Extension: jpg
*/
package project;
import java.io.*;//importing package java.io.*
class File_ICSE
    {                        //beginning of class
    public static void main(String args[])throws IOException
        {                   //beginning of main()
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter the full path of the file : ");
            String s = br.readLine();                    //storing full path of file in s
             
            int x = s.lastIndexOf('\\');                // Finding position of last backward slash
            int y = s.lastIndexOf('.');                 // Finding position of last '.'
             
            String path = s.substring(0,(x+1));         //Storing the results in following Strings
            String file = s.substring((x+1),y);
            String extn = s.substring((y+1));
             
            System.out.println("Output :");             //Printing the required output
            System.out.println("Path : "+path);
            System.out.println("File Name : "+file);
            System.out.println("Extension : "+extn);
        }                //end of main()
    }                    //end of class
    /*    
     *                      VARIABLE DESCRIPTION TABLE
 * 
 *      NAME                      DATA TYPE                     DESCRIPTION
 *      s                         String               TAKING THE VALUE FROM THE USER.
 *      x                         int                  STORES THE LAST INDEX OF " // ".                   
 *      Y                         int                  STORES THE LAT INDEX OF " . ".                    
 *      path                      String               IT IS USED TO STORE THE PATH OF FILE.
 *      file                      String               IT STORES THE NAME OF FILE
 *      extension                 String               IT IS USED TO STORE THE EXTENSION OF FILE.
 */