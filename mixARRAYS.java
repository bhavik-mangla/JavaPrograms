 import java.util.Scanner ;
 public class mixARRAYS {
     public static void main (String args []) {
         Scanner in = new Scanner (System.in);
         int n1 ;
         System.out.println ("Enter array A size:") ;
         n1 = in.nextInt() ;
         int [] A = new int [n1] ;
         System.out.println ("Enter values for array A") ;
         for (int i = 0 ; i < n1 ; i ++) {
             int val = in.nextInt();
             A [i] = val ; 
            }
           int n2 ;
         System.out.println ("Enter array B size:") ;
         n2 = in.nextInt() ;
         int [] B = new int [n2] ;
         System.out.println ("Enter values for array B") ;
         for (int i = 0 ; i < n2 ; i ++) {
             int val = in.nextInt();
             B [i] = val ; 
            } 
         int [] C = new int [A.length+B.length] ;
         for (int i = 0 ; i < n1 ; i ++) {
             C [i] = A[i] ; 
            } 
         for (int i = 0 ; i < n2 ; i ++) {
             C [i+n1] = B[i] ; 
            } 
         System.out.println ("Values of Array C :-") ;
         for(int i=0;i<C.length;i++){
            System.out.println ("C["+i+"] = "+ C[i]) ;
                    }
                }
            }