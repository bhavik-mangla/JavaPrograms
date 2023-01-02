/* Program Statement :Write a program to sort an array in ascending order using selection sort.*/
//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part 
//and putting it at the beginning. The algorithm maintains two subarrays in a given array.
package project;
import java.util.*;//importing Scanner class from util package
class  selSORT_asc// beginning of class
{
    public static void main(String args[])//beginning of main()
    {
        Scanner in = new Scanner(System.in);
        int n ;
         System.out.println ("Enter array size:") ;
         n = in.nextInt() ;//asking size of array
         int [] arr = new int [n] ;//array to store elements
         int i,min ;
          System.out.println ("Enter values for array") ;
         for ( i = 0 ; i < n ; i ++) {//for loop to store the values in array
             int val = in.nextInt();
             arr [i] = val ; 
            }
         for( i=0;i<n-1;i++)//loop to sort the array by selection sort
         {
             min=i;
             for(int j=i+1;j<n;j++)
             { if (arr[j]<arr[min])//by just changing the smaller than operator to greater than here will result in descending selection sort
                 min=j;}
            int t  = arr[i];//swapping smaller elements with element at index i. 
            arr[i]=arr[min];
            arr[min]=t;
        } //end for for loop
         System.out.println ("Sorted array in ascending order" );//printing the sorted array
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("arr{"+i+"] = "+arr[i] );
            }//end for for loop
        } //end of main()
    }//end of class
/*                                         VARIABLE DECRIPTION TABLE
                                      
 *      Variable Name                          Data type                               Decription
 *      n                                       int                            To store the array size.
 *      i                                       int                            counter variable of for loop...
 *      val                                     int                            To store the values.
 *      arr[]                                   int                            TAKES DIFFERENT VALUES OF ARRAY FROM THE USER.  
 *      min                                     int                            to find the smallest element.
 *      t                                       int                            temporary variable to swap elements.
 *      j                                       int                            counter variable of for loop...
 */