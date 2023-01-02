import java.io.* ;
public class BinarySearch {
    public static void main (String args []) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
        int n ;
        System.out.println ("Enter array size:") ;
        n = Integer.parseInt (br.readLine()) ;
        int range [] = new int [n] ;
        
        int i;
        for (i = 0 ; i < n ; i++) {
            System.out.println ("Enter value for array in ascending order:") ;
            int val = Integer.parseInt (br.readLine()) ;
            range [i] = val ;
        }
        
        System.out.println ("Enter number for search:") ;
        int element = Integer.parseInt (br.readLine ()) ;
        
        int first = 0, last = n - 1, find = 0, mid = 0 ; 
        int pos = 0 ;
        
       while (first <= last) {
           mid = (first + last) / 2 ;
           if (range [mid] == element) {
               pos = mid ; 
               find = 1 ;
               break;
            }
           if (element > range [mid] ) {
               first = mid + 1 ;
            }
            else { 
                last = mid - 1  ;
            }
        }
           if (find == 1) {
               System.out.println ("Element found at " +  (pos + 1) + " position") ;
               
            }
               else {
                   System.out.println ("Search not successful") ;
                }
            }
        }
    
        
      