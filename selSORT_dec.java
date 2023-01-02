import java.util.*;
class  selSORT_dec
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n ;
         System.out.println ("Enter array size:") ;
         n = in.nextInt() ;
         int [] arr = new int [n] ;
         int i,min ;
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("Enter values for array") ;
             int val = in.nextInt();
             arr [i] = val ; 
            }
         for( i=0;i<n;i++)
         {
             min=i;
             for(int j=i+1;j<n;j++)
             { if (arr[j]>arr[min])
                 min=j;}
            int t  = arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        } 
         System.out.println ("Sorted array in decending order" );
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("arr{"+i+"] = "+arr[i] );
            }
        }
    }