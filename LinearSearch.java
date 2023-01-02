/* Write a program to find a number in an array entered by the user and print whether the element is present in the array or not and if present on what location it is present */
 import java.util.Scanner ;
 public class LinearSearch {
     public static void main (String args []) {
         Scanner in = new Scanner (System.in);
         int n ;
         System.out.println ("Enter array size:") ;
         n = in.nextInt() ;
         int [] arr = new int [n] ;
         int i ;
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("Enter values for array") ;
             int val = in.nextInt();
             arr [i] = val ; 
            }
            
         System.out.println ("Enter value for search element:") ;
         int num = in.nextInt();
         int j ;
         int flag = 0 ;
         for (j = 0 ; j < n ; j ++) {
            if (num == arr [j]) {
               flag = 1 ;
                break;
                }
            }
                
           if (flag == 1) {
           System.out.println ("Element found at " + (j + 1 ) + " position") ;
          }
          else {
           System.out.println ("Element was not found") ;
                        }
                    }
                }