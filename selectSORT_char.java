import java.util.*;
class  selectSORT_char
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n ;
         System.out.println ("Enter array size:") ;
         n = in.nextInt() ;
         char [] arr = new char [n] ;
         int i,min ;
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("Enter values for array") ;
             char val = in.next().charAt(0);
             arr [i] = val ; 
            }
         for( i=0;i<n;i++)
         {
             min=i;
             for(int j=i+1;j<n;j++)
             { if ((arr[j])<arr[min])
                 min=j;}
            char t  = arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        } 
         System.out.println ("Sorted array in ascending order" );
         for ( i = 0 ; i < n ; i ++) {
             System.out.println ("arr{"+i+"] = "+arr[i] );
            }
        }
    }