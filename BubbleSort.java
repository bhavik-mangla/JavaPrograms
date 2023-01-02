import java.util.* ;
public class BubbleSort {
    public static void main (String args [])  {
        Scanner in = new Scanner (System.in) ;
        int n ;
        System.out.println ("Enter size of the array:") ;
        n = in.nextInt () ;
        int [] arr = new int [n] ;//n=5
        System.out.println ("Enter array elements:") ;
        for (int i = 0 ; i < n ; i++) {//5  3  4  1  2
            int val =in.nextInt() ;
            arr[i]=val ;
        }
        for (int i = 0 ; i < n-1 ; i++) {
                for (int j = 0; j < n -1 - i ; j++) {//n=4,3,2
                    if (arr[j+1]<arr[j]){
                    int tmp = arr[j] ;
                    arr[j] = arr[j + 1] ;          //3 5 4 1 2, 3 4 5 1 2, 
                    arr[j + 1] = tmp ;}
                }
            }
        System.out.println ("Array in ascending order is -->") ;
        for ( int i = 0 ; i < n ; i++) {
            System.out.println ( "arr["+i+"] = "+arr[i]) ;
        }
    }
}
        
       