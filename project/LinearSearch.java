/* Program Statement :Write a program to find a number in an array entered by the user and print
 * whether the element is present in the array or not and if present on what location is it present */
 package project;
 import java.io.* ;//Importing package 
 public class LinearSearch { // beginning of class
     public static void main (String args []) throws IOException { //beginning of main()
         BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
         int n ;
         System.out.println ("Enter array size:") ;//asking size of array
         n = Integer.parseInt (br.readLine()) ;
         int [] arr = new int [n] ;//array to store elements
         int i ;
          System.out.println ("Enter values for array") ;
         for ( i = 0 ; i < n ; i ++) {//for loop to store the values in array
             int val = Integer.parseInt (br.readLine()) ;
             arr [i] = val ; 
            }
            
            System.out.println ("Enter value for search element:") ;//Asking the search value from user
            int num = Integer.parseInt (br.readLine()) ;//storing search value in num
            int j ;
            int flag = 0 ;// initialising flag as 0
            for (j = 0 ; j < n ; j ++) {//loop to compare each element
                if (num == arr [j]) {//comparing
                    flag = 1 ;//if condition is true flag=1
                    break;
                }//end of if
            }//end of for
                
                 if (flag == 1) {// comparing and printing the result
                     System.out.println ("Element found at " + (j + 1 ) + " position") ;
                    }
                     else {
                         System.out.println ("Element was not found") ;
                        }
                    }//end of main()
                }//end of class
/*                                         VARIABLE DECRIPTION TABLE
                                      
 *      Variable Name                          Data type                               Decription
 *      n                                       int                            To store the array size.
 *      i                                       int                            counter variable of loop to enter the values.
 *      val                                     int                            To store the values.
 *      arr[]                                   int                            TAKES DIFFERENT VALUES OF ARRAY FROM THE USER.  
 *      num                                     int                            to store the search element.
 *      flag                                    int                            as a compare variable after either change or no change in value.
 *      j                                       int                            counter variable for search for loop .
 */