/* Program Statement :Write a program to sort an array in descending order using bubble sort.*/
/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Example:
First Pass:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
*/
package project;
import java.util.* ;//importing Scanner class from util package
public class BubbleSort_des {// beginning of class
    public static void main (String args [])  {//beginning of main()
        Scanner in = new Scanner (System.in) ;
        int n ;
        System.out.println ("Enter size of the array:") ;
        n = in.nextInt () ;//asking size of array
        int [] arr = new int [n] ;//array to store elements
        System.out.println ("Enter array elements:") ;
        for (int i = 0 ; i < n ; i++) {//for loop to store the values in array
            int val =in.nextInt() ;
            arr[i]=val ;
        }
        for (int i = 0 ; i < n-1 ; i++) {//loop to sort the array by bubble sort
                for (int j = 0; j < n -1 - i ; j++) {
                    if (arr[j+1]>arr[j]){//by just changing the greater than operator to smaller than here will result in ascending bubble sort
                    int tmp = arr[j] ;//swapping element at index j with the next element only if the condition is true.
                    arr[j] = arr[j + 1] ;
                    arr[j + 1] = tmp ;}
                }
            }//end for nested for loop
        System.out.println ("Array in ascending order is -->") ;//printing the sorted array
        for ( int i = 0 ; i < n ; i++) {
            System.out.println ( "arr["+i+"] = "+arr[i]) ;
        }//end for for loop
    } //end of main()
    }//end of class   
    /*
                                         VARIABLE DECRIPTION TABLE
                                      
 *      Variable Name                          Data type                               Decription
 *      n                                       int                            To store the array size.
 *      i                                       int                            counter variable of for loops.
 *      val                                     int                            To store the values of array.
 *      arr[]                                   int                            TAKES ELEMENTS OF ARRAY FROM THE USER.  
 *      tmp                                     int                            To perform swapping.
 *      j                                       int                            counter variable of for loops.
 */   