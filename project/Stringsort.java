/*program to sort(selection) the names(String) in ascending order lexographically with their phone numbers. */
package project;
 import java.util.Scanner;//importing Scanner class from util package
class Stringsort
 {
     public static void main (String args[])//main starts here
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the number of people");
           int nos=in.nextInt();//inputting the number of people
           long tel[]= new long[nos];//creating array to store their telephone number.
           String name[] = new String[nos];//creating array to store their names.
           System.out.println("Enter the names :");
           in.nextLine();int min;
           for (int i=0;i<nos;i++)//inputting name
           {
              name[i]=in.nextLine();//storing them in array name
         } 
              for (int i=0;i<nos;i++)//inputting telephone numbers
           {   System.out.println("Enter mobile number of "+ name[i]);
               tel[i]= in.nextLong();//storing them in array tel
         }
          for( int i=0;i<nos;i++)//SORTING
         {
             min=i;
             for(int j=i+1;j<nos;j++)
             { if ((name[j].compareTo(name[min]))<0)//sorting names by selection sort
                 min=j;}//using String method compare...
            String t  = name[i];
            name[i]=name[min];
            name[min]=t;
            long t1  = tel[i];//assigning their names with telephone number
            tel[i]=tel[min];//on same index numbers of the 2 arrays.
            tel[min]=t1;
        } 
         System.out.println ("Sorted names with telephone number in ascending order" );
         for (int  i = 0 ; i < nos ; i ++) {//for loop to print their sorted names with their number
             System.out.println ("Name :- "+name[i] );
             System.out.println ("Mobile number :- "+tel[i] );
             System.out.println ();
            }
        }//main ends here
    }
    
   /*                       VDT TABLE
    * VARIABLE NAME-->DATA TYPE -->DESCRIPTION
    *      nos          int        To input the no. of people
    *      tel        long(array)  To store their mobile number
    *      name      String(array) To store their names
    *      min         int         To sort their names
    *      t          String       To sort their names 
    *      t1          long        To assign their number on the same index number as of their names
    */