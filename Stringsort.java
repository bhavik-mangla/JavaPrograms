import java.util.Scanner;
class Stringsort
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the number of people");
           int nos=in.nextInt();
           long tel[]= new long[nos];
         long val;String val2;
           String name[] = new String[nos];
           System.out.println("Enter the names :");
           in.nextLine();int min;
           for (int i=0;i<nos;i++)
           {
              val2=in.nextLine();
              name[i]=val2;
         } 
              for (int i=0;i<nos;i++)
           {   System.out.println("Enter mobile number of "+ name[i]);
               val= in.nextLong();
               tel[i]=val;
         }
          for( int i=0;i<nos;i++)
         {
             min=i;
             for(int j=i+1;j<nos;j++)
             { if ((name[j].compareTo(name[min]))<0)
                 min=j;}
            String t  = name[i];
            name[i]=name[min];
            name[min]=t;
            long t1  = tel[i];
            tel[i]=tel[min];
            tel[min]=t1;
        } 
         System.out.println ("Sorted names with mobile number in ascending order" );
         for (int  i = 0 ; i < nos ; i ++) {
             System.out.println ("Name :- "+name[i] );
             System.out.println ("Mobile number :- "+tel[i] );
             System.out.println ();
            }
        }
    }