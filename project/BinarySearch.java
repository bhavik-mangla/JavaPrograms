package project;
// Program Statement: Program to implement Binary Search Method. Using BufferedReader class. Using main().
import java.io.*;//importing package
public class BinarySearch {//beginning of class
public static void main(String args[]) throws IOException
{//beginning of main()
//Declaring variables
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println ("Enter array size:") ;//asking size of array
int n = Integer.parseInt (br.readLine()) ;
int [] arr = new int [n] ;//array to store elements
int i ;
System.out.println ("Enter values for array in ascending order :") ;
for ( i = 0 ; i < n ; i ++) {//for loop to store the values in array
int val = Integer.parseInt (br.readLine()) ;
arr [i] = val ; 
}
int low=0, up=n-1; //lower and upper bound of array
int mid=0,nu;
boolean flag=false;
//Taking input
System.out.println("Enter  the number to be searched ");
nu=Integer.parseInt(br.readLine());
//Starting Search
while(low<=up){
mid=(low+up)/2;
if(nu==arr[mid]){
System.out.println(nu+" is present at index "+mid);
flag=true;
break;
}// end if
if(nu>arr[mid])
low=mid+1;
else
up=mid-1;
}//end while
//if  n is not present
if(flag==false)
System.out.println(nu+ " is not in the list");
}// method main() ends
}// class ends

  /*
 *   
                                         VARIABLE DECRIPTION TABLE
                                      
 *      Variable Name                          Data type                               Decription
 *      n                                       int                            To store the array size.
 *      i                                       int                            counter variable of loop to enter the values.
 *      arr[]                                   int                            TAKES DIFFERENT VALUES OF ARRAY FROM THE USER.  
 *      nu                                      int                            to store the search element.
 *      flag                                    int                            as a compare variable after either change or no change in value.
 *      low                                     int                            stores the lower index of array .
 *      up                                      int                            stores the upper index of array .                                                
 *      mid                                     int                            stores the middle index of array .                                 
 */